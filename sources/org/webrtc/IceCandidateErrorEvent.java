package org.webrtc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    public IceCandidateErrorEvent(String str, int i10, String str2, int i11, String str3) {
        this.address = str;
        this.port = i10;
        this.url = str2;
        this.errorCode = i11;
        this.errorText = str3;
    }
}
