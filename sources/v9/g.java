package v9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g {
    public final SharedPreferences a;

    public g(Context context, String str) {
        this.a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j10 = this.a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            int i9 = 0;
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d);
                        i9++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i9 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i9);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j10, long j11) {
        return d(j10).equals(d(j11));
    }

    public final synchronized void g() {
        String d = d(System.currentTimeMillis());
        this.a.edit().putString("last-used-date", d).commit();
        h(d);
    }

    public final synchronized void h(String str) {
        try {
            String e10 = e(str);
            if (e10 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(e10, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.a.edit().remove(e10).commit();
            } else {
                this.a.edit().putStringSet(e10, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j10) {
        return j(j10);
    }

    public final synchronized boolean j(long j10) {
        if (!this.a.contains("fire-global")) {
            this.a.edit().putLong("fire-global", j10).commit();
            return true;
        }
        if (f(this.a.getLong("fire-global", -1L), j10)) {
            return false;
        }
        this.a.edit().putLong("fire-global", j10).commit();
        return true;
    }

    public final synchronized void k(long j10, String str) {
        String d = d(j10);
        if (this.a.getString("last-used-date", "").equals(d)) {
            String e10 = e(d);
            if (e10 == null) {
                return;
            }
            if (e10.equals(str)) {
                return;
            }
            m(str, d);
            return;
        }
        long j11 = this.a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d).commit();
    }

    public final synchronized void l(long j10) {
        this.a.edit().putLong("fire-global", j10).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.a.edit().putStringSet(str, hashSet).commit();
    }
}
