package org.webrtc;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    public CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i, String str, int i2) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i2;
    }
}
