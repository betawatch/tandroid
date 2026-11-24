package org.webrtc;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
