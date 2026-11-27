// default package

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uf5 {
    public static final zj8 b = new zj8("fire-global");
    public static final zj8 c = new zj8("fire-count");
    public static final zj8 d = new zj8("last-used-date");
    public final av5 a;

    public uf5(Context context, String str) {
        this.a = new av5(context, "FirebaseHeartBeat".concat(str));
    }

    public static String c(long j) {
        return Build.VERSION.SDK_INT >= 26 ? DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) : new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public static zj8 d(rj7 rj7Var, String str) {
        for (Map.Entry entry : rj7Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((zj8) entry.getKey()).a;
                        str2.getClass();
                        return new zj8(str2);
                    }
                }
            }
        }
        return null;
    }

    public static void f(rj7 rj7Var, String str) {
        zj8 d2 = d(rj7Var, str);
        if (d2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) eqe.a(rj7Var, d2, new HashSet()));
        hashSet.remove(str);
        if (!hashSet.isEmpty()) {
            rj7Var.d(d2, hashSet);
        } else {
            rj7Var.b();
            rj7Var.a.remove(d2);
        }
    }

    public final synchronized void a() {
        this.a.a(new nx2(this));
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        String c2 = c(System.currentTimeMillis());
        for (Map.Entry entry : ((Map) ytd.a(new u73(this.a, null, (byte) 1))).entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(c2);
                if (!hashSet.isEmpty()) {
                    arrayList.add(new w90(((zj8) entry.getKey()).a, new ArrayList(hashSet)));
                }
            }
        }
        j(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized void e() {
        this.a.a(new a2(this, c(System.currentTimeMillis())));
    }

    public final synchronized boolean g(long j) {
        return h(b, j);
    }

    public final synchronized boolean h(zj8 zj8Var, long j) {
        if (c(((Long) this.a.b(zj8Var, -1L)).longValue()).equals(c(j))) {
            return false;
        }
        return true;
    }

    public final synchronized void i(long j, String str) {
        try {
            try {
                String c2 = c(j);
                str.getClass();
                zj8 zj8Var = new zj8(str);
                this.a.a(new m13(this, c2, str, zj8Var, (byte) 2));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void j(final long j) {
        this.a.a(new ur4() { // from class: tf5
            @Override // ur4
            public final Object invoke(Object obj) {
                ((rj7) obj).c(uf5.b, Long.valueOf(j));
                return null;
            }
        });
    }
}
