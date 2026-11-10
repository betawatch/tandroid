package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class w {
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
