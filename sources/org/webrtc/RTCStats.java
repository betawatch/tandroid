package org.webrtc;

import java.util.Map;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j3, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j3;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb2, Object obj) {
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof String)) {
                sb2.append(obj);
                return;
            }
            sb2.append('\"');
            sb2.append(obj);
            sb2.append('\"');
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb2.append('[');
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            appendValue(sb2, objArr[i10]);
        }
        sb2.append(']');
    }

    public static RTCStats create(long j3, String str, String str2, Map map) {
        return new RTCStats(j3, str, str2, map);
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
        StringBuilder v = a4.a.v("{ timestampUs: ");
        v.append(this.timestampUs);
        v.append(", type: ");
        v.append(this.type);
        v.append(", id: ");
        v.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            v.append(", ");
            v.append(entry.getKey());
            v.append(": ");
            appendValue(v, entry.getValue());
        }
        v.append(" }");
        return v.toString();
    }
}
