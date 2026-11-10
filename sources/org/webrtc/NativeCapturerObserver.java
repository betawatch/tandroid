package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    public NativeCapturerObserver(long j3) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j3);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z9) {
        this.nativeAndroidVideoTrackSource.setState(z9);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (adaptFrame == null || adaptFrame.drop) {
            return;
        }
        VideoFrame.Buffer cropAndScale = videoFrame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
        this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(cropAndScale, videoFrame.getRotation(), adaptFrame.timestampNs));
        cropAndScale.release();
    }
}
