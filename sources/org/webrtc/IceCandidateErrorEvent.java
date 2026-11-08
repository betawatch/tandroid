package org.webrtc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    public IceCandidateErrorEvent(String str, int i7, String str2, int i10, String str3) {
        this.address = str;
        this.port = i7;
        this.url = str2;
        this.errorCode = i10;
        this.errorText = str3;
    }
}
