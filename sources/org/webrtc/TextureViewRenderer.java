package org.webrtc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.of;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    public /* synthetic */ void lambda$onFrameResolutionChanged$0(int i10, int i11, int i12, int i13) {
        this.updateScreenRunnable = null;
        this.videoWidth = i10;
        this.videoHeight = i11;
        this.rotatedFrameWidth = i12;
        this.rotatedFrameHeight = i13;
        updateSurfaceSize();
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateVideoSizes$1(int i10, int i11) {
        this.updateScreenRunnable = null;
        this.rotatedFrameWidth = i10;
        this.rotatedFrameHeight = i11;
        updateSurfaceSize();
        requestLayout();
    }

    private void logD(String str) {
        Logging.d(TAG, this.resourceName + ": " + str);
    }

    private void onRotationChanged() {
        int i10;
        int i11 = this.useCameraRotation ? OrientationHelper.cameraOrientation : 0;
        boolean z10 = this.mirror;
        if (z10) {
            i11 = 360 - i11;
        }
        int i12 = -i11;
        if (this.useCameraRotation) {
            int i13 = this.screenRotation;
            if (i13 == 1) {
                i10 = z10 ? 90 : -90;
            } else if (i13 == 3) {
                i10 = z10 ? 270 : -270;
            }
            i12 += i10;
        }
        this.eglRenderer.setRotation(i12);
        this.eglRenderer.setMirror(this.mirror);
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            AndroidUtilities.runOnUIThread(runnable);
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
        int i10 = this.rotatedFrameWidth;
        int i11 = this.rotatedFrameHeight;
        if (i10 / i11 > width) {
            i10 = (int) (i11 * width);
        } else {
            i11 = (int) (i11 / width);
        }
        int min = Math.min(getWidth(), i10);
        int min2 = Math.min(getHeight(), i11);
        StringBuilder sb2 = new StringBuilder("updateSurfaceSize. Layout size: ");
        sb2.append(getWidth());
        sb2.append("x");
        sb2.append(getHeight());
        sb2.append(", frame size: ");
        sb2.append(this.rotatedFrameWidth);
        sb2.append("x");
        hc.b.w(sb2, this.rotatedFrameHeight, ", requested surface size: ", min, "x");
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
        int i10;
        int i11;
        int i12 = this.videoHeight;
        if (i12 == 0 || (i10 = this.videoWidth) == 0) {
            return;
        }
        if (!this.rotateTextureWithScreen) {
            int i13 = this.textureRotation - OrientationHelper.cameraOrientation;
            int i14 = (i13 == 0 || i13 == 180 || i13 == -180) ? this.videoWidth : this.videoHeight;
            i12 = (i13 == 0 || i13 == 180 || i13 == -180) ? this.videoHeight : this.videoWidth;
            i11 = i14;
        } else if (this.useCameraRotation) {
            int i15 = this.screenRotation;
            i11 = i15 == 0 ? i12 : i10;
            if (i15 == 0) {
                i12 = i10;
            }
        } else {
            int i16 = this.textureRotation;
            int i17 = (i16 == 0 || i16 == 180 || i16 == -180) ? i10 : i12;
            if (i16 != 0 && i16 != 180 && i16 != -180) {
                i12 = i10;
            }
            i11 = i17;
        }
        if (this.rotatedFrameWidth == i11 && this.rotatedFrameHeight == i12) {
            return;
        }
        synchronized (this.eglRenderer.layoutLock) {
            try {
                Runnable runnable = this.updateScreenRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                fg.n nVar = new fg.n(this, i11, i12, 14);
                this.updateScreenRunnable = nVar;
                postOrRun(nVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f7, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f7, glDrawer);
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
    public void onFrameResolutionChanged(int i10, int i11, int i12) {
        int i13;
        int i14;
        Throwable th2;
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i10, i11, i12);
        }
        this.textureRotation = i12;
        if (this.rotateTextureWithScreen) {
            if (this.isCamera) {
                onRotationChanged();
            }
            if (this.useCameraRotation) {
                int i15 = this.screenRotation;
                i13 = i15 == 0 ? i11 : i10;
            } else {
                int i16 = this.textureRotation;
                i13 = (i16 == 0 || i16 == 180 || i16 == -180) ? i10 : i11;
                if (i16 != 0) {
                    if (i16 != 180) {
                    }
                }
                i14 = i11;
            }
        } else {
            if (this.isCamera) {
                this.eglRenderer.setRotation(-OrientationHelper.cameraRotation);
            }
            int i17 = i12 - OrientationHelper.cameraOrientation;
            i13 = (i17 == 0 || i17 == 180 || i17 == -180) ? i10 : i11;
            if (i17 != 0) {
                if (i17 != 180) {
                }
            }
            i14 = i11;
        }
        int i18 = i14;
        int i19 = i13;
        synchronized (this.eglRenderer.layoutLock) {
            try {
                try {
                    Runnable runnable = this.updateScreenRunnable;
                    if (runnable != null) {
                        try {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    of ofVar = new of(this, i10, i11, i19, i18, 2);
                    this.updateScreenRunnable = ofVar;
                    postOrRun(ofVar);
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
    public void onMeasure(int i10, int i11) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.isCamera && this.rotateTextureWithScreen) {
            updateVideoSizes();
        }
        int i12 = this.maxTextureSize;
        Point measure = i12 > 0 ? this.videoLayoutMeasure.measure(this.isCamera, View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.min(this.maxTextureSize, View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)), this.rotatedFrameWidth, this.rotatedFrameHeight) : this.videoLayoutMeasure.measure(this.isCamera, i10, i11, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        if (this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0) {
            this.eglRenderer.setLayoutAspectRatio(getMeasuredWidth() / getMeasuredHeight());
        }
        updateSurfaceSize();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
        this.eglRenderer.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
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
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.surfaceWidth = i10;
        this.surfaceHeight = i11;
        this.eglRenderer.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
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
        if (LiteMode.isEnabled(512)) {
            this.backgroundRenderer = textureView;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: org.webrtc.TextureViewRenderer.1
                    @Override // android.view.TextureView.SurfaceTextureListener
                    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
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
                    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
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

    public void setFpsReduction(float f7) {
        this.eglRenderer.setFpsReduction(f7);
    }

    public void setIsCamera(boolean z10) {
        this.isCamera = z10;
        if (z10) {
            return;
        }
        OrientationHelper orientationHelper = new OrientationHelper() { // from class: org.webrtc.TextureViewRenderer.2
            @Override // org.webrtc.OrientationHelper
            public void onOrientationUpdate(int i10) {
                if (TextureViewRenderer.this.isCamera) {
                    return;
                }
                TextureViewRenderer.this.updateRotation();
            }
        };
        this.orientationHelper = orientationHelper;
        orientationHelper.start();
    }

    public void setMaxTextureSize(int i10) {
        this.maxTextureSize = i10;
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
    public void setRotation(float f7) {
        super.setRotation(f7);
    }

    @Override // android.view.View
    public void setRotationX(float f7) {
        super.setRotationX(f7);
    }

    @Override // android.view.View
    public void setRotationY(float f7) {
        super.setRotationY(f7);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
    }

    public void setScreenRotation(int i10) {
        this.screenRotation = i10;
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
        float f7;
        float f10;
        if (this.orientationHelper == null || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || (view = (View) getParent()) == null) {
            return;
        }
        int orientation = this.orientationHelper.getOrientation();
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth2 = view.getMeasuredWidth();
        float measuredHeight2 = view.getMeasuredHeight();
        if (orientation == 90 || orientation == 270) {
            f7 = measuredWidth;
            f10 = measuredHeight;
        } else {
            f10 = measuredWidth;
            f7 = measuredHeight;
        }
        float max = f10 < f7 ? Math.max(f10 / measuredWidth, f7 / measuredHeight) : Math.min(f10 / measuredWidth, f7 / measuredHeight);
        float f11 = f10 * max;
        float f12 = f7 * max;
        if (Math.abs((f11 / f12) - (measuredWidth2 / measuredHeight2)) < 0.1f) {
            max *= Math.max(measuredWidth2 / f11, measuredHeight2 / f12);
        }
        if (orientation == 270) {
            orientation = -90;
        }
        animate().scaleX(max).scaleY(max).rotation(-orientation).setDuration(180L).start();
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f7) {
        this.eglRenderer.addFrameListener(frameListener, f7);
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

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            AndroidUtilities.runOnUIThread(new h(this, 2));
        }

        @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            updateFrameDimensionsAndReportEvents(videoFrame);
            super.onFrame(videoFrame);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            ThreadUtils.checkIsOnMainThread();
            createEglSurface(surfaceTexture);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ThreadUtils.checkIsOnMainThread();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            releaseEglSurface(new org.telegram.ui.ActionBar.q(countDownLatch, 16), false);
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            ThreadUtils.checkIsOnMainThread();
            logD("surfaceChanged: size: " + i10 + "x" + i11);
        }

        @Override // org.webrtc.EglRenderer
        public void pauseVideo() {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = true;
            }
            super.pauseVideo();
        }

        @Override // org.webrtc.EglRenderer
        public void setFpsReduction(float f7) {
            synchronized (this.layoutLock) {
                this.isRenderingPaused = f7 == 0.0f;
            }
            super.setFpsReduction(f7);
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
