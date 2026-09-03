package org.webrtc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class Dav1dDecoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long j10) {
        return nativeCreateDecoder();
    }
}
