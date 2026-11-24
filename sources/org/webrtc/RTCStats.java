package org.webrtc;

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb.append(obj);
                return;
            }
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb.append('[');
        for (int i = 0; i < objArr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            appendValue(sb, objArr[i]);
        }
        sb.append(']');
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder s = td4.s("{ timestampUs: ");
        s.append(this.timestampUs);
        s.append(", type: ");
        s.append(this.type);
        s.append(", id: ");
        s.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            s.append(", ");
            s.append(entry.getKey());
            s.append(": ");
            appendValue(s, entry.getValue());
        }
        s.append(" }");
        return s.toString();
    }
}
