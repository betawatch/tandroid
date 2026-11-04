package org.webrtc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    public IceCandidateErrorEvent(String str, int i3, String str2, int i10, String str3) {
        this.address = str;
        this.port = i3;
        this.url = str2;
        this.errorCode = i10;
        this.errorText = str3;
    }
}
