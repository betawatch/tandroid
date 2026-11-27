package org.webrtc;

import org.webrtc.VideoDecoder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    @Override // org.webrtc.VideoDecoder
    public abstract long createNative(long j);

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
