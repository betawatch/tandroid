package org.webrtc;

import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j10, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j10;
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
        for (int i3 = 0; i3 < objArr.length; i3++) {
            if (i3 != 0) {
                sb2.append(", ");
            }
            appendValue(sb2, objArr[i3]);
        }
        sb2.append(']');
    }

    public static RTCStats create(long j10, String str, String str2, Map map) {
        return new RTCStats(j10, str, str2, map);
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
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("{ timestampUs: ");
        l10.append(this.timestampUs);
        l10.append(", type: ");
        l10.append(this.type);
        l10.append(", id: ");
        l10.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            l10.append(", ");
            l10.append(entry.getKey());
            l10.append(": ");
            appendValue(l10, entry.getValue());
        }
        l10.append(" }");
        return l10.toString();
    }
}
