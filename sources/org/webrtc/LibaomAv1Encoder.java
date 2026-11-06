package org.webrtc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public class LibaomAv1Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
