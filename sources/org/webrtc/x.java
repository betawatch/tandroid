package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
