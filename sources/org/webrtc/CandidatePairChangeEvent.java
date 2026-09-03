package org.webrtc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    public CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i10, String str, int i11) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i10;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i11;
    }
}
