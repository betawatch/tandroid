package org.webrtc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    public CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i7, String str, int i10) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i7;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i10;
    }
}
