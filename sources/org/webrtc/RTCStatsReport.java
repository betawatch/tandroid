package org.webrtc;

import java.util.Map;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
