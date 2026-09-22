package org.webrtc;

import java.util.Map;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j3, Map<String, RTCStats> map) {
        this.timestampUs = j3;
        this.stats = map;
    }

    private static RTCStatsReport create(long j3, Map map) {
        return new RTCStatsReport(j3, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ timestampUs: ");
        sb2.append(this.timestampUs);
        sb2.append(", stats: [\n");
        boolean z10 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z10) {
                sb2.append(",\n");
            }
            sb2.append(rTCStats);
            z10 = false;
        }
        sb2.append(" ] }");
        return sb2.toString();
    }
}
