package org.webrtc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
