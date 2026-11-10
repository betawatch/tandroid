package org.webrtc;

import java.util.Map;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        for (int i7 = 0; i7 < objArr.length; i7++) {
            if (i7 != 0) {
                sb2.append(", ");
            }
            appendValue(sb2, objArr[i7]);
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
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("{ timestampUs: ");
        m10.append(this.timestampUs);
        m10.append(", type: ");
        m10.append(this.type);
        m10.append(", id: ");
        m10.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            m10.append(", ");
            m10.append(entry.getKey());
            m10.append(": ");
            appendValue(m10, entry.getValue());
        }
        m10.append(" }");
        return m10.toString();
    }
}
