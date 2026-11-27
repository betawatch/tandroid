package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // org.webrtc.VideoEncoder
    public abstract long createNative(long j);

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(1, false);
    }

    @Override // org.webrtc.VideoEncoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        return setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }
}
