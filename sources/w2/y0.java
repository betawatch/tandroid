package w2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.ActionBar.e3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y0 extends a {
    public final i2.g h;
    public final e3 i;
    public final p2.m j;
    public final kb.a k;
    public final int l;
    public final d2.v m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public i2.d0 s;
    public d2.n0 t;

    public y0(d2.n0 n0Var, i2.g gVar, e3 e3Var, p2.m mVar, kb.a aVar, int i3, d2.v vVar) {
        this.t = n0Var;
        this.h = gVar;
        this.i = e3Var;
        this.j = mVar;
        this.k = aVar;
        this.l = i3;
        this.m = vVar;
    }

    @Override // w2.a
    public final boolean a(d2.n0 n0Var) {
        d2.i0 i0Var = i().b;
        i0Var.getClass();
        d2.i0 i0Var2 = n0Var.b;
        return i0Var2 != null && i0Var2.a.equals(i0Var.a) && i0Var2.h == i0Var.h && Objects.equals(i0Var2.f, i0Var.f);
    }

    @Override // w2.a
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        i2.h createDataSource = this.h.createDataSource();
        i2.d0 d0Var = this.s;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        d2.i0 i0Var = i().b;
        i0Var.getClass();
        Uri uri = i0Var.a;
        this.g.getClass();
        return new w0(uri, createDataSource, new p7.d((e3.r) this.i.b), this.j, new p2.j(this.d.c, 0, g0Var), this.k, b(g0Var), this, a0Var, i0Var.f, this.l, this.m, g2.n0.S(i0Var.h), null);
    }

    @Override // w2.a
    public final synchronized d2.n0 i() {
        return this.t;
    }

    @Override // w2.a
    public final void m(i2.d0 d0Var) {
        this.s = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        l2.k kVar = this.g;
        kVar.getClass();
        p2.m mVar = this.j;
        mVar.k(myLooper, kVar);
        mVar.a();
        u();
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        w0 w0Var = (w0) e0Var;
        if (w0Var.P) {
            for (c1 c1Var : w0Var.M) {
                c1Var.l();
                p2.g gVar = c1Var.h;
                if (gVar != null) {
                    gVar.b(c1Var.e);
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

    @Override // w2.a
    public final void q() {
        this.j.release();
    }

    @Override // w2.a
    public final synchronized void t(d2.n0 n0Var) {
        this.t = n0Var;
    }

    public final void u() {
        long j10 = this.o;
        boolean z10 = this.p;
        boolean z11 = this.q;
        d2.n0 i3 = i();
        d2.n1 j1Var = new j1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i3, z11 ? i3.c : null);
        if (this.n) {
            j1Var = new v(j1Var, 1);
        }
        n(j1Var);
    }

    public final void v(long j10, e3.b0 b0Var, boolean z10) {
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

    @Override // w2.a
    public final void k() {
    }
}
