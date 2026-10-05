package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class x {
    public static long a(VideoEncoder videoEncoder) {
        return 0L;
    }

    public static VideoEncoder.EncoderInfo b(VideoEncoder videoEncoder) {
        return new VideoEncoder.EncoderInfo(1, false);
    }

    public static VideoEncoder.ResolutionBitrateLimits[] c(VideoEncoder videoEncoder) {
        return new VideoEncoder.ResolutionBitrateLimits[0];
    }

    public static boolean d(VideoEncoder videoEncoder) {
        return true;
    }

    public static VideoCodecStatus e(VideoEncoder videoEncoder, VideoEncoder.RateControlParameters rateControlParameters) {
        return videoEncoder.setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
    }
}
