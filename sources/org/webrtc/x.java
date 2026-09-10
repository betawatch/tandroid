package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
