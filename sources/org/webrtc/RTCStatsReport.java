package org.webrtc;

import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        boolean z9 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z9) {
                sb2.append(",\n");
            }
            sb2.append(rTCStats);
            z9 = false;
        }
        sb2.append(" ] }");
        return sb2.toString();
    }
}
