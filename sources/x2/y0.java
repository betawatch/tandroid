package x2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class y0 extends a {
    public final j2.g h;
    public final tg.o1 i;
    public final q2.m j;
    public final qb.a k;
    public final int l;
    public final e2.u m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public j2.c0 s;
    public e2.l0 t;

    public y0(e2.l0 l0Var, j2.g gVar, tg.o1 o1Var, q2.m mVar, qb.a aVar, int i7, e2.u uVar) {
        this.t = l0Var;
        this.h = gVar;
        this.i = o1Var;
        this.j = mVar;
        this.k = aVar;
        this.l = i7;
        this.m = uVar;
    }

    @Override // x2.a
    public final boolean a(e2.l0 l0Var) {
        e2.g0 g0Var = i().b;
        g0Var.getClass();
        e2.g0 g0Var2 = l0Var.b;
        return g0Var2 != null && g0Var2.a.equals(g0Var.a) && g0Var2.h == g0Var.h && Objects.equals(g0Var2.f, g0Var.f);
    }

    @Override // x2.a
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        j2.h createDataSource = this.h.createDataSource();
        j2.c0 c0Var = this.s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        e2.g0 g0Var2 = i().b;
        g0Var2.getClass();
        Uri uri = g0Var2.a;
        this.g.getClass();
        return new w0(uri, createDataSource, new md0((f3.r) this.i.b), this.j, new q2.j(this.d.c, 0, g0Var), this.k, b(g0Var), this, mVar, g0Var2.f, this.l, this.m, h2.l0.S(g0Var2.h), null);
    }

    @Override // x2.a
    public final synchronized e2.l0 i() {
        return this.t;
    }

    @Override // x2.a
    public final void m(j2.c0 c0Var) {
        this.s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.i iVar = this.g;
        iVar.getClass();
        q2.m mVar = this.j;
        mVar.r1(myLooper, iVar);
        mVar.a();
        u();
    }

    @Override // x2.a
    public final void o(e0 e0Var) {
        w0 w0Var = (w0) e0Var;
        if (w0Var.P) {
            for (c1 c1Var : w0Var.M) {
                c1Var.l();
                q2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.c(c1Var.e);
                    c1Var.h = null;
                    c1Var.g = null;
                }
            }
        }
        w0Var.y.e(w0Var);
        w0Var.I.removeCallbacksAndMessages(null);
        w0Var.J = null;
        w0Var.i0 = true;
    }

    @Override // x2.a
    public final void q() {
        this.j.release();
    }

    @Override // x2.a
    public final synchronized void t(e2.l0 l0Var) {
        this.t = l0Var;
    }

    public final void u() {
        long j3 = this.o;
        boolean z10 = this.p;
        boolean z11 = this.q;
        e2.l0 i7 = i();
        e2.l1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i7, z11 ? i7.c : null);
        if (this.n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j3, f3.b0 b0Var, boolean z10) {
        if (this.r && b0Var.e()) {
            return;
        }
        this.r = !b0Var.e();
        if (j3 == -9223372036854775807L) {
            j3 = this.o;
        }
        boolean d = b0Var.d();
        if (!this.n && this.o == j3 && this.p == d && this.q == z10) {
            return;
        }
        this.o = j3;
        this.p = d;
        this.q = z10;
        this.n = false;
        u();
    }

    @Override // x2.a
    public final void k() {
    }
}
