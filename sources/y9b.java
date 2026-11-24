// default package

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class y9b {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ o90 g;

    public y9b(o90 o90Var, int i) {
        this.g = o90Var;
        this.a = i;
    }

    public final void a() {
        long duration;
        o90 o90Var = this.g;
        xnb xnbVar = (xnb) o90Var.e;
        cdb cdbVar = (cdb) o90Var.f;
        y54 y54Var = (y54) o90Var.a;
        aob y0 = y54Var.y0();
        Object l = y0.p() ? null : y0.l(y54Var.A());
        int k0 = y54Var.k0();
        int L = y54Var.L();
        long m = y54Var.m();
        if (l == null || k0 != -1) {
            duration = k0 != -1 ? y54Var.getDuration() : -9223372036854775807L;
        } else {
            y0.g(l, xnbVar);
            m -= g8c.i0(xnbVar.e);
            duration = g8c.i0(xnbVar.d);
        }
        boolean j = y54Var.j();
        if (!j || duration == -9223372036854775807L || m < duration) {
            cdbVar.g(3);
            if (j && duration != -9223372036854775807L) {
                cdbVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - m) / y54Var.g().a));
            }
            this.e = false;
            return;
        }
        ((adb) o90Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && k0 == this.c && L == this.d) {
            if (elapsedRealtime - this.f >= i) {
                ((t54) o90Var.c).a.t1(new j54(2, new aab(3, i), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.b = l;
        this.c = k0;
        this.d = L;
        cdbVar.g(3);
        cdbVar.a.sendEmptyMessageDelayed(3, i);
    }
}
