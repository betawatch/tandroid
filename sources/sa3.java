// default package

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sa3 {
    public final of5 a;
    public final HashMap b;
    public final boolean c;
    public final /* synthetic */ ta3 d;

    public sa3(ta3 ta3Var, of5 of5Var, boolean z) {
        this.d = ta3Var;
        this.a = of5Var;
        HashMap hashMap = new HashMap();
        v5c it = of5Var.a().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) of5Var.b.get(str);
            uri.getClass();
            hashMap.put(uri, new ra3(this.d, uri, str));
        }
        this.b = hashMap;
        this.c = z;
    }

    public final boolean a(long j, Uri uri, String str) {
        Uri uri2;
        HashMap hashMap = this.b;
        gre.p(hashMap.containsKey(uri));
        ra3 ra3Var = (ra3) hashMap.get(uri);
        ra3Var.getClass();
        ra3Var.r = SystemClock.elapsedRealtime() + j;
        ta3 ta3Var = this.d;
        se5 se5Var = ta3Var.y;
        if ((!(se5Var != null && se5Var.k && str == null) && f(str, false)) || !((uri2 = ta3Var.I) == null || uri.equals(uri2))) {
            return true;
        }
        mm5 mm5Var = ta3Var.E;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < mm5Var.size(); i++) {
            Uri b = ((of5) mm5Var.get(i)).b();
            sa3 sa3Var = (sa3) ta3Var.d.get(b);
            sa3Var.getClass();
            if (!sa3Var.c(elapsedRealtime, b)) {
                ta3Var.I = b;
                sa3Var.d(b, ta3Var.d(b));
                return true;
            }
        }
        return false;
    }

    public final df5 b(Uri uri) {
        HashMap hashMap = this.b;
        gre.p(hashMap.containsKey(uri));
        ra3 ra3Var = (ra3) hashMap.get(uri);
        ra3Var.getClass();
        return ra3Var.e;
    }

    public final boolean c(long j, Uri uri) {
        HashMap hashMap = this.b;
        gre.p(hashMap.containsKey(uri));
        ra3 ra3Var = (ra3) hashMap.get(uri);
        ra3Var.getClass();
        return j <= ra3Var.r;
    }

    public final void d(Uri uri, Uri uri2) {
        HashMap hashMap = this.b;
        gre.p(hashMap.containsKey(uri));
        ra3 ra3Var = (ra3) hashMap.get(uri);
        ra3Var.getClass();
        ra3Var.c(uri2);
    }

    public final void e(Uri uri, boolean z) {
        HashMap hashMap = this.b;
        gre.p(hashMap.containsKey(uri));
        ra3 ra3Var = (ra3) hashMap.get(uri);
        ra3Var.getClass();
        ra3Var.c(z ? ra3Var.a() : ra3Var.a);
    }

    public final boolean f(String str, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        of5 of5Var = this.a;
        HashMap hashMap = this.b;
        if (str == null) {
            Iterator it = hashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                ra3 ra3Var = (ra3) it.next();
                if (!ra3Var.b.contains(of5Var.d) && elapsedRealtime > ra3Var.r) {
                    str = (String) ra3Var.b.iterator().next();
                    break;
                }
            }
        } else {
            for (ra3 ra3Var2 : hashMap.values()) {
                if (ra3Var2.b.contains(str)) {
                    ra3Var2.r = 0L;
                }
            }
        }
        if (str == null) {
            return false;
        }
        Uri b = of5Var.b();
        gre.p(of5Var.b.containsKey(str));
        of5Var.d = str;
        Uri b2 = of5Var.b();
        ta3 ta3Var = this.d;
        if (b.equals(ta3Var.I)) {
            ta3Var.h(b2, z);
        }
        ra3 ra3Var3 = (ra3) hashMap.get(b);
        ra3Var3.getClass();
        ra3 ra3Var4 = (ra3) hashMap.get(b2);
        ra3Var4.getClass();
        ra3Var4.x = ra3Var3.x;
        ra3Var3.x = false;
        return true;
    }
}
