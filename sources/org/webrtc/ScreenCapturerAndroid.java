package org.webrtc;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class ScreenCapturerAndroid implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;

    public ScreenCapturerAndroid(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            zo4.k("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        try {
            this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, VIRTUAL_DISPLAY_DPI, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeCaptureFormat$1(int i, int i2) {
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            virtualDisplay.release();
            createVirtualDisplay();
        } else {
            this.surfaceTextureHelper.setTextureSize(i, i2);
            this.virtualDisplay.resize(i, i2, VIRTUAL_DISPLAY_DPI);
            this.virtualDisplay.setSurface(new Surface(this.surfaceTextureHelper.getSurfaceTexture()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopCapture$0() {
        this.surfaceTextureHelper.stopListening();
        this.capturerObserver.onCapturerStopped();
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.virtualDisplay = null;
        }
        MediaProjection mediaProjection = this.mediaProjection;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.mediaProjectionCallback);
            this.mediaProjection.stop();
            this.mediaProjection = null;
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i, int i2, int i3) {
        checkNotDisposed();
        this.width = i;
        this.height = i2;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new cu((Object) this, i, i2, (byte) 14));
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int i, int i2, int i3) {
        if (this.mediaProjection != null || this.mediaProjectionManager == null) {
            return;
        }
        try {
            checkNotDisposed();
            this.width = i;
            this.height = i2;
            MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
            this.mediaProjection = mediaProjection;
            mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
            createVirtualDisplay();
            this.capturerObserver.onCapturerStarted(true);
            this.surfaceTextureHelper.startListening(this);
        } catch (Throwable th) {
            this.mediaProjectionCallback.onStop();
            fc4.g(th, true);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new kf9(this, (byte) 16));
    }

    @Override // org.webrtc.VideoSink
    public final void setParentSink(VideoSink videoSink) {
    }
}
