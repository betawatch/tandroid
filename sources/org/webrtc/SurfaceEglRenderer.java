package org.webrtc;

import android.view.SurfaceHolder;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.ActionBar.w5;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private static final String TAG = "SurfaceEglRenderer";
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock;
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    public SurfaceEglRenderer(String str) {
        super(str);
        this.layoutLock = new Object();
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
                if (!this.isFirstFrameRendered) {
                    this.isFirstFrameRendered = true;
                    logD("Reporting first rendered frame.");
                    RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                    if (rendererEvents != null) {
                        rendererEvents.onFirstFrameRendered();
                    }
                }
                if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                    logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                    RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                    if (rendererEvents2 != null) {
                        rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
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

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
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

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: format: " + i10 + " size: " + i11 + "x" + i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new w5(countDownLatch, 0), false);
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }
}
