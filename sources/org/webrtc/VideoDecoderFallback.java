package org.webrtc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public class VideoDecoderFallback extends WrappedNativeVideoDecoder {
    private final VideoDecoder fallback;
    private final VideoDecoder primary;

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }

    private static native long nativeCreate(long j3, VideoDecoder videoDecoder, VideoDecoder videoDecoder2);

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j3) {
        return nativeCreate(j3, this.fallback, this.primary);
    }
}
