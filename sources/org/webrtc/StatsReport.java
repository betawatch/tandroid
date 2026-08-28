package org.webrtc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class StatsReport {
    public final String id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Value {
        public final String name;
        public final String value;

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.name);
            sb2.append(": ");
            return aa.d.r(sb2, this.value, "]");
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i9 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i9 >= valueArr.length) {
                return sb2.toString();
            }
            sb2.append(valueArr[i9].toString());
            sb2.append(", ");
            i9++;
        }
    }
}
