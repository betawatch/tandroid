package org.webrtc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
