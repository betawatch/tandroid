package org.webrtc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    public CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i9, String str, int i10) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i9;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i10;
    }
}
