// default package

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class tyc {
    public final String a;
    public final LinkedHashMap b;

    public tyc(String str) {
        if (!h0f.a(str)) {
            lq5.j("'name' is not a valid token.");
            throw null;
        }
        this.a = str;
        this.b = new LinkedHashMap();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        for (Map.Entry entry : this.b.entrySet()) {
            sb.append("; ");
            sb.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (str != null && str.length() != 0) {
                sb.append("=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
