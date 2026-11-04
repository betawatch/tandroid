package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.br;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.d4;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class TextureViewRenderer extends TextureView implements TextureView.SurfaceTextureListener, VideoSink, RendererCommon.RendererEvents {
    private static final String TAG = "TextureViewRenderer";
    private TextureView backgroundRenderer;
    private int cameraRotation;
    private final TextureEglRenderer eglRenderer;
    private boolean enableFixedSize;
    private boolean isCamera;
    private int maxTextureSize;
    private boolean mirror;
    private OrientationHelper orientationHelper;
    private VideoSink parentSink;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private boolean rotateTextureWithScreen;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    private int screenRotation;
    private int surfaceHeight;
    private int surfaceWidth;
    int textureRotation;
    Runnable updateScreenRunnable;
    boolean useCameraRotation;
    private int videoHeight;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    private int videoWidth;

    public TextureViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.eglRenderer = new TextureEglRenderer(resourceName);
        setSurfaceTextureListener(this);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$0(int i3, int i10, int i11, int i12) {
        this.updateScreenRunnable = null;
        this.videoWidth = i3;
        this.videoHeight = i10;
        this.rotatedFrameWidth = i11;
        this.rotatedFrameHeight = i12;
        updateSurfaceSize();
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateVideoSizes$1(int i3, int i10) {
        this.updateScreenRunnable = null;
        this.rotatedFrameWidth = i3;
        this.rotatedFrameHeight = i10;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        Logging.d(TAG, this.resourceName + ": " + str);
    }

    private void onRotationChanged() {
        int i3;
        int i10 = this.useCameraRotation ? OrientationHelper.cameraOrientation : 0;
        boolean z10 = this.mirror;
        if (z10) {
            i10 = 360 - i10;
        }
        int i11 = -i10;
        if (this.useCameraRotation) {
            int i12 = this.screenRotation;
            if (i12 == 1) {
                i3 = z10 ? 90 : -90;
            } else if (i12 == 3) {
                i3 = z10 ? hs.t4 : -270;
            }
            i11 += i3;
        }
        this.eglRenderer.setRotation(i11);
        this.eglRenderer.setMirror(this.mirror);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            g0.h3(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            return;
        }
        float width = getWidth() / getHeight();
        int i3 = this.rotatedFrameWidth;
        int i10 = this.rotatedFrameHeight;
        if (i3 / i10 > width) {
            i3 = (int) (i10 * width);
        } else {
            i10 = (int) (i10 / width);
        }
        int min = Math.min(getWidth(), i3);
        int min2 = Math.min(getHeight(), i10);
        StringBuilder sb2 = new StringBuilder("updateSurfaceSize. Layout size: ");
        sb2.append(getWidth());
        sb2.append("x");
        sb2.append(getHeight());
        sb2.append(", frame size: ");
        sb2.append(this.rotatedFrameWidth);
        sb2.append("x");
        com.google.android.recaptcha.internal.a.r(sb2, this.rotatedFrameHeight, ", requested surface size: ", min, "x");
        sb2.append(min2);
        sb2.append(", old surface size: ");
        sb2.append(this.surfaceWidth);
        sb2.append("x");
        sb2.append(this.surfaceHeight);
        logD(sb2.toString());
        if (min == this.surfaceWidth && min2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = min;
        this.surfaceHeight = min2;
    }

    private void updateVideoSizes() {
        int i3;
        int i10;
        int i11 = this.videoHeight;
        if (i11 == 0 || (i3 = this.videoWidth) == 0) {
            return;
        }
        if (!this.rotateTextureWithScreen) {
            int i12 = this.textureRotation - OrientationHelper.cameraOrientation;
            int i13 = (i12 == 0 || i12 == 180 || i12 == -180) ? this.videoWidth : this.videoHeight;
            i11 = (i12 == 0 || i12 == 180 || i12 == -180) ? this.videoHeight : this.videoWidth;
            i10 = i13;
        } else if (this.useCameraRotation) {
            int i14 = this.screenRotation;
            i10 = i14 == 0 ? i11 : i3;
            if (i14 == 0) {
                i11 = i3;
            }
        } else {
            int i15 = this.textureRotation;
            int i16 = (i15 == 0 || i15 == 180 || i15 == -180) ? i3 : i11;
            if (i15 != 0 && i15 != 180 && i15 != -180) {
                i11 = i3;
            }
            i10 = i16;
        }
        if (this.rotatedFrameWidth == i10 && this.rotatedFrameHeight == i11) {
            return;
        }
        synchronized (this.eglRenderer.layoutLock) {
            try {
                Runnable runnable = this.updateScreenRunnable;
                if (runnable != null) {
                    g0.r(runnable);
                }
                k2.u uVar = new k2.u(this, i10, i11, 17);
                this.updateScreenRunnable = uVar;
                postOrRun(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f10, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f10, glDrawer);
    }

    public void clearFirstFrame() {
        TextureEglRenderer textureEglRenderer = this.eglRenderer;
        textureEglRenderer.firstFrameRendered = false;
        textureEglRenderer.isFirstFrameRendered = false;
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
        this.eglRenderer.isFirstFrameRendered = false;
    }

    public void createBackgroundSurface(SurfaceTexture surfaceTexture) {
        this.eglRenderer.createBackgroundSurface(surfaceTexture);
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void getRenderBufferBitmap(GlGenericDrawer.TextureCallback textureCallback) {
        this.eglRenderer.getTexture(textureCallback);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public boolean isFirstFrameRendered() {
        return this.eglRenderer.isFirstFrameRendered;
    }

    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r11 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003b, code lost:
    
        if (r11 != (-180)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x005b, code lost:
    
        if (r11 != (-180)) goto L17;
     */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFrameResolutionChanged(int i3, int i10, int i11) {
        int i12;
        int i13;
        Throwable th2;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i3, i10, i11);
        }
        this.textureRotation = i11;
        if (this.rotateTextureWithScreen) {
            if (this.isCamera) {
                onRotationChanged();
            }
            if (this.useCameraRotation) {
                int i14 = this.screenRotation;
                i12 = i14 == 0 ? i10 : i3;
            } else {
                int i15 = this.textureRotation;
                i12 = (i15 == 0 || i15 == 180 || i15 == -180) ? i3 : i10;
                if (i15 != 0) {
                    if (i15 != 180) {
                    }
                }
                i13 = i10;
            }
        } else {
            if (this.isCamera) {
                this.eglRenderer.setRotation(-OrientationHelper.cameraRotation);
            }
            int i16 = i11 - OrientationHelper.cameraOrientation;
            i12 = (i16 == 0 || i16 == 180 || i16 == -180) ? i3 : i10;
            if (i16 != 0) {
                if (i16 != 180) {
                }
            }
            i13 = i10;
        }
        int i17 = i13;
        int i18 = i12;
        synchronized (this.eglRenderer.layoutLock) {
            try {
                try {
                    Runnable runnable = this.updateScreenRunnable;
                    if (runnable != null) {
                        try {
                            g0.r(runnable);
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    br brVar = new br(this, i3, i10, i18, i17, 2);
                    this.updateScreenRunnable = brVar;
                    postOrRun(brVar);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.isCamera && this.rotateTextureWithScreen) {
            updateVideoSizes();
        }
        int i11 = this.maxTextureSize;
        Point measure = i11 > 0 ? this.videoLayoutMeasure.measure(this.isCamera, View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i3)), View.MeasureSpec.getMode(i3)), View.MeasureSpec.makeMeasureSpec(Math.min(this.maxTextureSize, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), this.rotatedFrameWidth, this.rotatedFrameHeight) : this.videoLayoutMeasure.measure(this.isCamera, i3, i10, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        if (this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0) {
            this.eglRenderer.setLayoutAspectRatio(getMeasuredWidth() / getMeasuredHeight());
        }
        updateSurfaceSize();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
        this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, i3, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        VideoSink videoSink = this.parentSink;
        if (videoSink instanceof VoIPService.ProxyVideoSink) {
            VoIPService.ProxyVideoSink proxyVideoSink = (VoIPService.ProxyVideoSink) videoSink;
            proxyVideoSink.removeTarget(this);
            proxyVideoSink.removeBackground(this);
        }
        this.eglRenderer.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        this.surfaceWidth = i3;
        this.surfaceHeight = i10;
        this.eglRenderer.onSurfaceTextureSizeChanged(surfaceTexture, i3, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.eglRenderer.onSurfaceTextureUpdated(surfaceTexture);
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
        OrientationHelper orientationHelper = this.orientationHelper;
        if (orientationHelper != null) {
            orientationHelper.stop();
        }
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setBackgroundRenderer(TextureView textureView) {
        if (lc.e(512)) {
            this.backgroundRenderer = textureView;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: org.webrtc.TextureViewRenderer.1
                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
                        TextureViewRenderer.this.createBackgroundSurface(surfaceTexture);
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                        ThreadUtils.checkIsOnMainThread();
                        TextureViewRenderer.this.eglRenderer.releaseEglSurface(null, true);
                        return false;
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }

                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
                    }
                });
            } else {
                ThreadUtils.checkIsOnMainThread();
                this.eglRenderer.releaseEglSurface(null, true);
            }
        }
    }

    public void setEnableHardwareScaler(boolean z10) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z10;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f10) {
        this.eglRenderer.setFpsReduction(f10);
    }

    public void setIsCamera(boolean z10) {
        this.isCamera = z10;
        if (z10) {
            return;
        }
        OrientationHelper orientationHelper = new OrientationHelper() { // from class: org.webrtc.TextureViewRenderer.2
            @Override // org.webrtc.OrientationHelper
            public void onOrientationUpdate(int i3) {
                if (TextureViewRenderer.this.isCamera) {
                    return;
                }
                TextureViewRenderer.this.updateRotation();
            }
        };
        this.orientationHelper = orientationHelper;
        orientationHelper.start();
    }

    public void setMaxTextureSize(int i3) {
        this.maxTextureSize = i3;
    }

    public void setMirror(boolean z10) {
        if (this.mirror != z10) {
            this.mirror = z10;
            if (this.rotateTextureWithScreen) {
                onRotationChanged();
            } else {
                this.eglRenderer.setMirror(z10);
            }
            updateSurfaceSize();
            requestLayout();
        }
    }

    @Override // org.webrtc.VideoSink
    public void setParentSink(VideoSink videoSink) {
        this.parentSink = videoSink;
    }

    public void setRotateTextureWithScreen(boolean z10) {
        if (this.rotateTextureWithScreen != z10) {
            this.rotateTextureWithScreen = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        super.setRotation(f10);
    }

    @Override // android.view.View
    public void setRotationX(float f10) {
        super.setRotationX(f10);
    }

    @Override // android.view.View
    public void setRotationY(float f10) {
        super.setRotationY(f10);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setScreenRotation(int i3) {
        this.screenRotation = i3;
        onRotationChanged();
        updateVideoSizes();
    }

    public void setUseCameraRotation(boolean z10) {
        if (this.useCameraRotation != z10) {
            this.useCameraRotation = z10;
            onRotationChanged();
            updateVideoSizes();
        }
    }

    public void updateRotation() {
        View view;
        float f10;
        float f11;
        if (this.orientationHelper == null || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || (view = (View) getParent()) == null) {
            return;
        }
        int orientation = this.orientationHelper.getOrientation();
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth2 = view.getMeasuredWidth();
        float measuredHeight2 = view.getMeasuredHeight();
        if (orientation == 90 || orientation == 270) {
            f10 = measuredWidth;
            f11 = measuredHeight;
        } else {
            f11 = measuredWidth;
            f10 = measuredHeight;
        }
        float max = f11 < f10 ? Math.max(f11 / measuredWidth, f10 / measuredHeight) : Math.min(f11 / measuredWidth, f10 / measuredHeight);
        float f12 = f11 * max;
        float f13 = f10 * max;
        if (Math.abs((f12 / f13) - (measuredWidth2 / measuredHeight2)) < 0.1f) {
            max *= Math.max(measuredWidth2 / f12, measuredHeight2 / f13);
        }
        if (orientation == 270) {
            orientation = -90;
        }
        animate().scaleX(max).scaleY(max).rotation(-orientation).setDuration(180L).start();
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f10) {
        this.eglRenderer.addFrameListener(frameListener, f10);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
        private static final String TAG = "TextureEglRenderer";
        private int frameRotation;
        private boolean isFirstFrameRendered;
        private boolean isRenderingPaused;
        private final Object layoutLock;
        private RendererCommon.RendererEvents rendererEvents;
        private int rotatedFrameHeight;
        private int rotatedFrameWidth;

        public TextureEglRenderer(String str) {
            super(str);
            this.layoutLock = new Object();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFirstFrameRendered$0() {
            this.isFirstFrameRendered = true;
            this.rendererEvents.onFirstFrameRendered();
        }

        private void logD(String str) {
            Logging.d(TAG, this.name + ": " + str);
        }

        private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
            synchronized (this.layoutLock) {
                try {
                    if (this.isRenderingPaused) {
                        return;
                    }
                    if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                        logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                        if (rendererEvents != null) {
                            rendererEvents.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                        }
                        this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                        this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                        this.frameRotation = videoFrame.getRotation();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.webrtc.EglRenderer
        public void disableFpsReduction() {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = false;
            }
            super.disableFpsReduction();
        }

        public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
            ThreadUtils.checkIsOnMainThread();
            this.rendererEvents = rendererEvents;
            synchronized (this.layoutLock) {
                this.isFirstFrameRendered = false;
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                this.frameRotation = 0;
            }
            super.init(context, iArr, glDrawer);
        }

        @Override // org.webrtc.EglRenderer
        public void onFirstFrameRendered() {
            g0.h3(new h(this, 2));
        }

        @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            updateFrameDimensionsAndReportEvents(videoFrame);
            super.onFrame(videoFrame);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
            ThreadUtils.checkIsOnMainThread();
            createEglSurface(surfaceTexture);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ThreadUtils.checkIsOnMainThread();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            releaseEglSurface(new d4(countDownLatch, 4), false);
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
            ThreadUtils.checkIsOnMainThread();
            logD("surfaceChanged: size: " + i3 + "x" + i10);
        }

        @Override // org.webrtc.EglRenderer
        public void pauseVideo() {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = true;
            }
            super.pauseVideo();
        }

        @Override // org.webrtc.EglRenderer
        public void setFpsReduction(float f10) {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = f10 == 0.0f;
            }
            super.setFpsReduction(f10);
        }

        @Override // org.webrtc.EglRenderer
        public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
            init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
