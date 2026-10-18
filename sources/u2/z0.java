package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class z0 extends a {
    public final g2.g h;
    public final qg.g0 i;
    public final n2.n j;
    public final oa.d k;
    public final int l;
    public final b2.w m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public g2.c0 s;
    public b2.o0 t;

    public z0(b2.o0 o0Var, g2.g gVar, qg.g0 g0Var, n2.n nVar, oa.d dVar, int i10, b2.w wVar) {
        this.t = o0Var;
        this.h = gVar;
        this.i = g0Var;
        this.j = nVar;
        this.k = dVar;
        this.l = i10;
        this.m = wVar;
    }

    @Override // u2.a
    public final boolean a(b2.o0 o0Var) {
        b2.j0 j0Var = i().b;
        j0Var.getClass();
        b2.j0 j0Var2 = o0Var.b;
        return j0Var2 != null && j0Var2.a.equals(j0Var.a) && j0Var2.h == j0Var.h && Objects.equals(j0Var2.f, j0Var.f);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.s;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.j0 j0Var = i().b;
        j0Var.getClass();
        Uri uri = j0Var.a;
        this.g.getClass();
        return new x0(uri, createDataSource, new c((c3.r) this.i.b), this.j, new n2.k(this.d.c, 0, g0Var), this.k, b(g0Var), this, eVar, j0Var.f, this.l, this.m, e2.m0.S(j0Var.h), null);
    }

    @Override // u2.a
    public final synchronized b2.o0 i() {
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
        nVar.E(myLooper, kVar);
        nVar.b();
        u();
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        x0 x0Var = (x0) e0Var;
        if (x0Var.O) {
            for (d1 d1Var : x0Var.L) {
                d1Var.l();
                n2.h hVar = d1Var.h;
                if (hVar != null) {
                    hVar.a(d1Var.e);
                    d1Var.h = null;
                    d1Var.g = null;
                }
            }
        }
        x0Var.x.e(x0Var);
        x0Var.H.removeCallbacksAndMessages(null);
        x0Var.I = null;
        x0Var.h0 = true;
    }

    @Override // u2.a
    public final void q() {
        this.j.release();
    }

    @Override // u2.a
    public final synchronized void t(b2.o0 o0Var) {
        this.t = o0Var;
    }

    public final void u() {
        long j10 = this.o;
        boolean z10 = this.p;
        boolean z11 = this.q;
        b2.o0 i10 = i();
        b2.o1 k1Var = new k1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i10, z11 ? i10.c : null);
        if (this.n) {
            k1Var = new v(k1Var, 1);
        }
        n(k1Var);
    }

    public final void v(long j10, c3.c0 c0Var, boolean z10) {
        if (this.r && c0Var.e()) {
            return;
        }
        this.r = !c0Var.e();
        if (j10 == -9223372036854775807L) {
            j10 = this.o;
        }
        boolean d = c0Var.d();
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
