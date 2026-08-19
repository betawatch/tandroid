package org.webrtc;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.FileLog;
import org.webrtc.EglBase;
import org.webrtc.GlGenericDrawer;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;
import org.webrtc.VideoSink;

/* loaded from: classes3.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private final GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final Matrix drawMatrix;
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private final EglSurfaceCreation eglSurfaceBackgroundCreationRunnable;
    private final EglSurfaceCreation eglSurfaceCreationRunnable;
    private volatile ErrorCallback errorCallback;
    public boolean firstFrameRendered;
    private final Object fpsReductionLock;
    private final VideoFrameDrawer frameDrawer;
    private final ArrayList<FrameListenerAndParams> frameListeners;
    private final Object frameLock;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private final Object handlerLock;
    private float layoutAspectRatio;
    private final Object layoutLock;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private int rotation;
    private boolean usePresentationTimeStamp;

    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    protected void onFirstFrameRendered() {
    }

    @Override // org.webrtc.VideoSink
    public /* synthetic */ void setParentSink(VideoSink videoSink) {
        VideoSink.-CC.$default$setParentSink(this, videoSink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    private class EglSurfaceCreation implements Runnable {
        private final boolean background;
        private Object surface;

        public EglSurfaceCreation(boolean z) {
            this.background = z;
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x002b, code lost:
        
            if (r3.this$0.eglBase.hasSurface() == false) goto L16;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.this.eglBase != null) {
                    if (this.background) {
                        if (!EglRenderer.this.eglBase.hasBackgroundSurface()) {
                            Object obj = this.surface;
                            if (obj instanceof Surface) {
                                EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                            } else if (obj instanceof SurfaceTexture) {
                                if (this.background) {
                                    EglRenderer.this.eglBase.createBackgroundSurface((SurfaceTexture) this.surface);
                                } else {
                                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                                }
                            } else {
                                throw new IllegalStateException("Invalid surface: " + this.surface);
                            }
                            if (!this.background) {
                                EglRenderer.this.eglBase.makeCurrent();
                                GLES20.glPixelStorei(3317, 1);
                            } else {
                                EglRenderer.this.eglBase.makeBackgroundCurrent();
                                GLES20.glPixelStorei(3317, 1);
                                if (EglRenderer.this.eglBase.hasSurface()) {
                                    EglRenderer.this.eglBase.makeCurrent();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.e(EglRenderer.TAG, "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.handlerLock = new Object();
        this.frameListeners = new ArrayList<>();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation(false);
        this.eglSurfaceBackgroundCreationRunnable = new EglSurfaceCreation(true);
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void init(final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                this.firstFrameRendered = false;
                HandlerThread handlerThread = new HandlerThread(this.name + TAG);
                handlerThread.start();
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() { // from class: org.webrtc.EglRenderer.1
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (EglRenderer.this.handlerLock) {
                            EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                handlerWithExceptionCallback.post(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.$r8$lambda$4UtvfIMmN1fLlIPXvJIZxXWorw4(EglRenderer.this, context, iArr);
                    }
                });
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$4UtvfIMmN1fLlIPXvJIZxXWorw4(EglRenderer eglRenderer, EglBase.Context context, int[] iArr) {
        if (context == null) {
            eglRenderer.logD("EglBase10.create context");
            eglRenderer.eglBase = EglBase.-CC.createEgl10(iArr);
        } else {
            eglRenderer.logD("EglBase.create shared context");
            eglRenderer.eglBase = EglBase.-CC.create(context, iArr);
        }
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface, false);
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture, false);
    }

    public void createBackgroundSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture, true);
    }

    private void createEglSurfaceInternal(Object obj, boolean z) {
        if (z) {
            this.eglSurfaceBackgroundCreationRunnable.setSurface(obj);
            synchronized (this.handlerLock) {
                try {
                    Handler handler = this.renderThreadHandler;
                    if (handler != null) {
                        handler.post(this.eglSurfaceBackgroundCreationRunnable);
                    } else {
                        FileLog.d("can't create background surface. render thread is null");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logD("Already released");
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.$r8$lambda$I28Rv5yetPjumOczkFXp_x0fUaA(EglRenderer.this, countDownLatch);
                    }
                });
                final Looper looper = this.renderThreadHandler.getLooper();
                this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.$r8$lambda$vcNGV2jB4gRc5aTYtRZ8M3jQcAA(EglRenderer.this, looper);
                    }
                });
                this.renderThreadHandler = null;
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } finally {
                    }
                }
                logD("Releasing done.");
            } finally {
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$I28Rv5yetPjumOczkFXp_x0fUaA(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        eglRenderer.getClass();
        synchronized (EglBase.lock) {
            GLES20.glUseProgram(0);
        }
        RendererCommon.GlDrawer glDrawer = eglRenderer.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            eglRenderer.drawer = null;
        }
        eglRenderer.frameDrawer.release();
        eglRenderer.bitmapTextureFramebuffer.release();
        if (eglRenderer.eglBase != null) {
            eglRenderer.logD("eglBase detach and release.");
            eglRenderer.eglBase.detachCurrent();
            eglRenderer.eglBase.release();
            eglRenderer.eglBase = null;
        }
        eglRenderer.frameListeners.clear();
        countDownLatch.countDown();
    }

    public static /* synthetic */ void $r8$lambda$vcNGV2jB4gRc5aTYtRZ8M3jQcAA(EglRenderer eglRenderer, Looper looper) {
        eglRenderer.logD("Quitting render thread.");
        looper.quit();
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                Thread thread = handler == null ? null : handler.getLooper().getThread();
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void setMirror(boolean z) {
        logD("setMirrorHorizontally: " + z);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        logD("setMirrorVertically: " + z);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void setLayoutAspectRatio(float f) {
        if (this.layoutAspectRatio != f) {
            synchronized (this.layoutLock) {
                this.layoutAspectRatio = f;
            }
        }
    }

    public void setFpsReduction(float f) {
        logD("setFpsReduction: " + f);
        synchronized (this.fpsReductionLock) {
            try {
                long j = this.minRenderPeriodNs;
                if (f <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (TimeUnit.SECONDS.toNanos(1L) / f);
                }
                if (this.minRenderPeriodNs != j) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EglRenderer.$r8$lambda$k6r7WZUappVwCJWCRm68wowpQ0o(EglRenderer.this, glDrawer, frameListener, f, z);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$k6r7WZUappVwCJWCRm68wowpQ0o(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = eglRenderer.drawer;
        }
        eglRenderer.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    return;
                }
                if (Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
                postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.$r8$lambda$AGculjaeHGUUmvzH8WnbPGR2xU8(EglRenderer.this, countDownLatch, frameListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$AGculjaeHGUUmvzH8WnbPGR2xU8(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        eglRenderer.getClass();
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = eglRenderer.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame2 = this.pendingFrame;
                        if (videoFrame2 != null) {
                            videoFrame2.release();
                        }
                        this.pendingFrame = videoFrame;
                        videoFrame.retain();
                        this.renderThreadHandler.post(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda5
                            @Override // java.lang.Runnable
                            public final void run() {
                                EglRenderer.this.renderFrameOnRenderThread();
                            }
                        });
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRotation(int i) {
        synchronized (this.layoutLock) {
            this.rotation = i;
        }
    }

    public void releaseEglSurface(final Runnable runnable, final boolean z) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            EglRenderer.$r8$lambda$dxplJoayrWiYtrBlBosBi-UbiV0(EglRenderer.this, z, runnable);
                        }
                    });
                } else if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$dxplJoayrWiYtrBlBosBi-UbiV0(EglRenderer eglRenderer, boolean z, Runnable runnable) {
        EglBase eglBase = eglRenderer.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            eglRenderer.eglBase.releaseSurface(z);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfaceOnRenderThread(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
            this.eglBase.swapBuffers(false);
        }
        EglBase eglBase2 = this.eglBase;
        if (eglBase2 == null || !eglBase2.hasBackgroundSurface()) {
            return;
        }
        this.eglBase.makeBackgroundCurrent();
        logD("clearSurface in background");
        GLES20.glClearColor(f, f2, f3, f4);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers(true);
        this.eglBase.makeCurrent();
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
        this.firstFrameRendered = false;
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.clearSurfaceOnRenderThread(f, f2, f3, f4);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void getTexture(final GlGenericDrawer.TextureCallback textureCallback) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.frameDrawer.getRenderBufferBitmap(r0.drawer, EglRenderer.this.rotation, textureCallback);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z;
        float f;
        float f2;
        float f3;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase = this.eglBase;
                if (eglBase == null || !eglBase.hasSurface()) {
                    logD("Dropping frame - No surface");
                    videoFrame.release();
                    return;
                }
                synchronized (this.fpsReductionLock) {
                    long j = this.minRenderPeriodNs;
                    if (j != Long.MAX_VALUE) {
                        if (j > 0) {
                            long nanoTime = System.nanoTime();
                            long j2 = this.nextFrameTimeNs;
                            if (nanoTime >= j2) {
                                long j3 = j2 + this.minRenderPeriodNs;
                                this.nextFrameTimeNs = j3;
                                this.nextFrameTimeNs = Math.max(j3, nanoTime);
                            }
                        }
                        z = true;
                    }
                    z = false;
                }
                System.nanoTime();
                boolean z2 = Math.abs(this.rotation) == 90 || Math.abs(this.rotation) == 270;
                float rotatedHeight = (z2 ? videoFrame.getRotatedHeight() : videoFrame.getRotatedWidth()) / (z2 ? videoFrame.getRotatedWidth() : videoFrame.getRotatedHeight());
                synchronized (this.layoutLock) {
                    f = this.layoutAspectRatio;
                    if (f == 0.0f) {
                        f = rotatedHeight;
                    }
                }
                if (rotatedHeight > f) {
                    f3 = f / rotatedHeight;
                    f2 = 1.0f;
                } else {
                    f2 = rotatedHeight / f;
                    f3 = 1.0f;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                this.drawMatrix.preRotate(this.rotation);
                this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
                this.drawMatrix.preScale(f3, f2);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                if (z) {
                    try {
                        try {
                            this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), z2, false);
                            if (this.eglBase.hasBackgroundSurface()) {
                                this.eglBase.makeBackgroundCurrent();
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), z2, true);
                                if (this.usePresentationTimeStamp) {
                                    this.eglBase.swapBuffers(videoFrame.getTimestampNs(), true);
                                } else {
                                    this.eglBase.swapBuffers(true);
                                }
                                this.eglBase.makeCurrent();
                            }
                            System.nanoTime();
                            if (this.usePresentationTimeStamp) {
                                this.eglBase.swapBuffers(videoFrame.getTimestampNs(), false);
                            } else {
                                this.eglBase.swapBuffers(false);
                            }
                            if (!this.firstFrameRendered) {
                                this.firstFrameRendered = true;
                                onFirstFrameRendered();
                            }
                        } catch (GlUtil.GlOutOfMemoryException e) {
                            logE("Error while drawing frame", e);
                            ErrorCallback errorCallback = this.errorCallback;
                            if (errorCallback != null) {
                                errorCallback.onGlOutOfMemory();
                            }
                            this.drawer.release();
                            this.frameDrawer.release();
                            this.bitmapTextureFramebuffer.release();
                            videoFrame.release();
                            return;
                        }
                    } catch (Throwable th) {
                        videoFrame.release();
                        throw th;
                    }
                }
                notifyCallbacks(videoFrame, z);
                videoFrame.release();
            } finally {
            }
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preRotate(this.rotation);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight, false, false);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    next.listener.onFrame(createBitmap);
                }
            }
        }
    }

    private void logE(String str, Throwable th) {
        Logging.e(TAG, this.name + str, th);
    }

    private void logD(String str) {
        Logging.d(TAG, this.name + str);
    }

    private void logW(String str) {
        Logging.w(TAG, this.name + str);
    }
}
