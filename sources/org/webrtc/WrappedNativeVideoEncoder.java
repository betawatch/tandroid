package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class WrappedNativeVideoEncoder implements VideoEncoder {
    @Override // org.webrtc.VideoEncoder
    public abstract long createNativeVideoEncoder();

    @Override // org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final /* synthetic */ VideoEncoder.EncoderInfo getEncoderInfo() {
        return x.b(this);
    }

    @Override // org.webrtc.VideoEncoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final /* synthetic */ VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return x.c(this);
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
    public final VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i10) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final /* synthetic */ VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        return x.e(this, rateControlParameters);
    }
}
