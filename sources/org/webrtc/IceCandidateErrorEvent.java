package org.webrtc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
