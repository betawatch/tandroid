// default package

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qa3 implements mf5 {
    public final /* synthetic */ ta3 a;

    public qa3(ta3 ta3Var) {
        this.a = ta3Var;
    }

    @Override // mf5
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // mf5
    public final boolean b(Uri uri, dd ddVar, boolean z) {
        ta3 ta3Var = this.a;
        HashMap hashMap = ta3Var.d;
        if (ta3Var.J == null) {
            se5 se5Var = ta3Var.y;
            boolean z2 = se5Var != null && se5Var.k;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sa3 sa3Var = (sa3) hashMap.get(uri);
            sa3Var.getClass();
            of5 of5Var = sa3Var.a;
            int size = of5Var.b.size();
            v5c it = ym5.q(of5Var.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                if (ta3Var.e(elapsedRealtime, (Uri) it.next())) {
                    i++;
                }
            }
            int size2 = ta3Var.E.size();
            km5 listIterator = ta3Var.E.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                of5 of5Var2 = (of5) listIterator.next();
                if (z2 ? ta3Var.e(elapsedRealtime, of5Var2.b()) : ta3Var.f(of5Var2, elapsedRealtime)) {
                    i2++;
                }
            }
            c86 c86Var = new c86(z2, size, i, size2, i2);
            ta3Var.c.getClass();
            d86 u3 = i2f.u3(c86Var, ddVar);
            if (u3 != null) {
                long j = u3.b;
                if (z2 && u3.a == 1) {
                    se5 se5Var2 = ta3Var.y;
                    se5Var2.getClass();
                    return se5Var2.a(j);
                }
                sa3 sa3Var2 = (sa3) hashMap.get(uri);
                if (sa3Var2 != null) {
                    return sa3Var2.a(j, uri, null);
                }
            }
        }
        return false;
    }
}
