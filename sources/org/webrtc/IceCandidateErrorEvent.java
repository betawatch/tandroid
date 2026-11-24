package org.webrtc;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    public IceCandidateErrorEvent(String str, int i, String str2, int i2, String str3) {
        this.address = str;
        this.port = i;
        this.url = str2;
        this.errorCode = i2;
        this.errorText = str3;
    }
}
