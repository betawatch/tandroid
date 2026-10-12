package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class y0 extends a {
    public final g2.g h;
    public final rg.b0 i;
    public final n2.n j;
    public final oa.d k;
    public final int l;
    public final b2.x m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public g2.c0 s;
    public b2.p0 t;

    public y0(b2.p0 p0Var, g2.g gVar, rg.b0 b0Var, n2.n nVar, oa.d dVar, int i10, b2.x xVar) {
        this.t = p0Var;
        this.h = gVar;
        this.i = b0Var;
        this.j = nVar;
        this.k = dVar;
        this.l = i10;
        this.m = xVar;
    }

    @Override // u2.a
    public final boolean a(b2.p0 p0Var) {
        b2.k0 k0Var = i().b;
        k0Var.getClass();
        b2.k0 k0Var2 = p0Var.b;
        return k0Var2 != null && k0Var2.a.equals(k0Var.a) && k0Var2.h == k0Var.h && Objects.equals(k0Var2.f, k0Var.f);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.k0 k0Var = i().b;
        k0Var.getClass();
        Uri uri = k0Var.a;
        this.g.getClass();
        return new w0(uri, createDataSource, new c((c3.r) this.i.b), this.j, new n2.k(this.d.c, 0, g0Var), this.k, b(g0Var), this, eVar, k0Var.f, this.l, this.m, e2.m0.S(k0Var.h), null);
    }

    @Override // u2.a
    public final synchronized b2.p0 i() {
        return this.t;
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.s = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.g;
        kVar.getClass();
        n2.n nVar = this.j;
        nVar.D(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        w0 w0Var = (w0) e0Var;
        if (w0Var.O) {
            for (c1 c1Var : w0Var.L) {
                c1Var.l();
                n2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.a(c1Var.e);
                    c1Var.h = null;
                    c1Var.g = null;
                }
            }
        }
        w0Var.x.e(w0Var);
        w0Var.H.removeCallbacksAndMessages(null);
        w0Var.I = null;
        w0Var.h0 = true;
    }

    @Override // u2.a
    public final void q() {
        this.j.release();
    }

    @Override // u2.a
    public final synchronized void t(b2.p0 p0Var) {
        this.t = p0Var;
    }

    public final void u() {
        long j10 = this.o;
        boolean z10 = this.p;
        boolean z11 = this.q;
        b2.p0 i10 = i();
        b2.p1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, z11 ? i10.c : null);
        if (this.n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, c3.b0 b0Var, boolean z10) {
        if (this.r && b0Var.e()) {
            return;
        }
        this.r = !b0Var.e();
        if (j10 == -9223372036854775807L) {
            j10 = this.o;
        }
        boolean d = b0Var.d();
        if (!this.n && this.o == j10 && this.p == d && this.q == z10) {
            return;
        }
        this.o = j10;
        this.p = d;
        this.q = z10;
        this.n = false;
        u();
    }

    @Override // u2.a
    public final void k() {
    }
}
