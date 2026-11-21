package org.webrtc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
