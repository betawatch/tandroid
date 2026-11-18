package org.webrtc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
