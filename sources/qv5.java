// default package

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qv5 {
    public final HashMap a = new HashMap();
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public qv5(int i) {
        this.b = i;
    }

    public static String b(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean c(String str, String str2) {
        String b = b(this.b, str);
        if (this.a.size() >= 64 && !this.a.containsKey(b)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: 64", null);
            return false;
        }
        String b2 = b(this.b, str2);
        String str3 = (String) this.a.get(b);
        if (str3 == null ? b2 == null : str3.equals(b2)) {
            return false;
        }
        HashMap hashMap = this.a;
        if (str2 == null) {
            b2 = "";
        }
        hashMap.put(b, b2);
        return true;
    }

    public final synchronized void d(Map map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String b = b(this.b, str);
            if (this.a.size() < 64 || this.a.containsKey(b)) {
                String str2 = (String) entry.getValue();
                this.a.put(b, str2 == null ? "" : b(this.b, str2));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: 64", null);
        }
    }
}
