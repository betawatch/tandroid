package x9;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class d {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public d(int i10) {
        this.c = i10;
    }

    public static String b(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean c(String str, String str2) {
        String b10 = b(this.c, str);
        if (this.a.size() >= this.b && !this.a.containsKey(b10)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b, null);
            return false;
        }
        String b11 = b(this.c, str2);
        String str3 = (String) this.a.get(b10);
        if (str3 == null ? b11 == null : str3.equals(b11)) {
            return false;
        }
        HashMap hashMap = this.a;
        if (str2 == null) {
            b11 = "";
        }
        hashMap.put(b10, b11);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String b10 = b(this.c, str);
                if (this.a.size() >= this.b && !this.a.containsKey(b10)) {
                    i10++;
                }
                String str2 = (String) entry.getValue();
                this.a.put(b10, str2 == null ? "" : b(this.c, str2));
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
