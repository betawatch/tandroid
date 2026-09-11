package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
