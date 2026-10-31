package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
class VideoEncoderWrapper {
    public static VideoEncoder.Callback createEncoderCallback(long j10) {
        return new w(j10);
    }

    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j10, EncodedImage encodedImage);
}
