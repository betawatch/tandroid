package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import m.e3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class y0 extends a {
    public final g2.g h;
    public final th.e i;
    public final n2.n j;
    public final rb.a k;
    public final int l;
    public final b2.s m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public g2.c0 r;
    public b2.k0 s;

    public y0(b2.k0 k0Var, g2.g gVar, th.e eVar, n2.n nVar, rb.a aVar, int i10, b2.s sVar) {
        this.s = k0Var;
        this.h = gVar;
        this.i = eVar;
        this.j = nVar;
        this.k = aVar;
        this.l = i10;
        this.m = sVar;
    }

    @Override // u2.a
    public final boolean a(b2.k0 k0Var) {
        b2.f0 f0Var = i().b;
        f0Var.getClass();
        b2.f0 f0Var2 = k0Var.b;
        return f0Var2 != null && f0Var2.a.equals(f0Var.a) && f0Var2.h == f0Var.h && Objects.equals(f0Var2.f, f0Var.f);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var = i().b;
        f0Var.getClass();
        Uri uri = f0Var.a;
        e2.d.h(this.g);
        return new w0(uri, createDataSource, new e3((c3.r) this.i.b), this.j, new n2.j(this.d.c, 0, g0Var), this.k, b(g0Var), this, dVar, f0Var.f, this.l, this.m, e2.d0.Q(f0Var.h), null);
    }

    @Override // u2.a
    public final synchronized b2.k0 i() {
        return this.s;
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j2.k kVar = this.g;
        e2.d.h(kVar);
        n2.n nVar = this.j;
        nVar.C(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        w0 w0Var = (w0) e0Var;
        if (w0Var.N) {
            for (c1 c1Var : w0Var.K) {
                c1Var.k();
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
        w0Var.f0 = true;
    }

    @Override // u2.a
    public final void q() {
        this.j.release();
    }

    @Override // u2.a
    public final synchronized void t(b2.k0 k0Var) {
        this.s = k0Var;
    }

    public final void u() {
        long j3 = this.o;
        boolean z10 = this.p;
        boolean z11 = this.q;
        b2.k0 i10 = i();
        b2.k1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, z11 ? i10.c : null);
        if (this.n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j3, c3.b0 b0Var, boolean z10) {
        if (j3 == -9223372036854775807L) {
            j3 = this.o;
        }
        boolean f7 = b0Var.f();
        if (!this.n && this.o == j3 && this.p == f7 && this.q == z10) {
            return;
        }
        this.o = j3;
        this.p = f7;
        this.q = z10;
        this.n = false;
        u();
    }

    @Override // u2.a
    public final void k() {
    }
}
