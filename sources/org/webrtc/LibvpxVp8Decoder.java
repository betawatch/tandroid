package org.webrtc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder(long j3);

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j3) {
        return nativeCreateDecoder(j3);
    }
}
