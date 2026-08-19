package org.webrtc;

/* loaded from: classes3.dex */
public interface VideoDecoderFactory {
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();

    public abstract /* synthetic */ class -CC {
        public static VideoCodecInfo[] $default$getSupportedCodecs(VideoDecoderFactory videoDecoderFactory) {
            return new VideoCodecInfo[0];
        }
    }
}
