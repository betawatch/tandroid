package rc;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class w {
    public final String a;
    public final LinkedHashMap b;

    public w(String str) {
        if (!d.b(str)) {
            throw new IllegalArgumentException("'name' is not a valid token.");
        }
        this.a = str;
        this.b = new LinkedHashMap();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(this.a);
        for (Map.Entry entry : this.b.entrySet()) {
            sb2.append("; ");
            sb2.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (str != null && str.length() != 0) {
                sb2.append("=");
                sb2.append(str);
            }
        }
        return sb2.toString();
    }
}
