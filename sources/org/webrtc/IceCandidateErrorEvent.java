package org.webrtc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
