package org.webrtc;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class LibvpxVp9Decoder extends WrappedNativeVideoDecoder {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    interface Natives {
        long createDecoder();

        boolean isSupported();
    }

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j) {
        return LibvpxVp9DecoderJni.get().createDecoder();
    }
}
