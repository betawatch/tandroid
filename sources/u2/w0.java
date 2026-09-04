package u2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import rg.p2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class w0 extends a {
    public final g2.g h;
    public final p2 i;
    public final n2.m j;
    public final rb.a k;
    public final int l;
    public final b2.s m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public g2.c0 r;
    public b2.k0 s;

    public w0(b2.k0 k0Var, g2.g gVar, p2 p2Var, n2.m mVar, rb.a aVar, int i10, b2.s sVar) {
        this.s = k0Var;
        this.h = gVar;
        this.i = p2Var;
        this.j = mVar;
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
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        g2.h createDataSource = this.h.createDataSource();
        g2.c0 c0Var = this.r;
        if (c0Var != null) {
            createDataSource.addTransferListener(c0Var);
        }
        b2.f0 f0Var2 = i().b;
        f0Var2.getClass();
        Uri uri = f0Var2.a;
        e2.d.h(this.g);
        return new u0(uri, createDataSource, new m2.t((c3.r) this.i.b), this.j, new n2.j(this.d.c, 0, f0Var), this.k, b(f0Var), this, dVar, f0Var2.f, this.l, this.m, e2.d0.Q(f0Var2.h), null);
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
        n2.m mVar = this.j;
        mVar.B(myLooper, kVar);
        mVar.b();
        u();
    }

    @Override // u2.a
    public final void o(d0 d0Var) {
        u0 u0Var = (u0) d0Var;
        if (u0Var.N) {
            for (a1 a1Var : u0Var.K) {
                a1Var.k();
                n2.g gVar = a1Var.h;
                if (gVar != null) {
                    gVar.a(a1Var.e);
                    a1Var.h = null;
                    a1Var.g = null;
                }
            }
        }
        u0Var.x.e(u0Var);
        u0Var.H.removeCallbacksAndMessages(null);
        u0Var.I = null;
        u0Var.f0 = true;
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
        b2.k1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z10, false, false, null, i10, z11 ? i10.c : null);
        if (this.n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
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
