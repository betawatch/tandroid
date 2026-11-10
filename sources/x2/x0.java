package x2;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class x0 extends a {
    public final j2.g h;
    public final u5.e i;
    public final q2.m j;
    public final pb.b k;
    public final int l;
    public final e2.u m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public j2.d0 s;
    public e2.l0 t;

    public x0(e2.l0 l0Var, j2.g gVar, u5.e eVar, q2.m mVar, pb.b bVar, int i7, e2.u uVar) {
        this.t = l0Var;
        this.h = gVar;
        this.i = eVar;
        this.j = mVar;
        this.k = bVar;
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
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        j2.h createDataSource = this.h.createDataSource();
        j2.d0 d0Var = this.s;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        e2.g0 g0Var = i().b;
        g0Var.getClass();
        Uri uri = g0Var.a;
        this.g.getClass();
        return new v0(uri, createDataSource, new ly0((f3.r) this.i.b), this.j, new q2.j(this.d.c, 0, f0Var), this.k, b(f0Var), this, mVar, g0Var.f, this.l, this.m, h2.m0.S(g0Var.h), null);
    }

    @Override // x2.a
    public final synchronized e2.l0 i() {
        return this.t;
    }

    @Override // x2.a
    public final void m(j2.d0 d0Var) {
        this.s = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.j jVar = this.g;
        jVar.getClass();
        q2.m mVar = this.j;
        mVar.E(myLooper, jVar);
        mVar.a();
        u();
    }

    @Override // x2.a
    public final void o(d0 d0Var) {
        v0 v0Var = (v0) d0Var;
        if (v0Var.O) {
            for (a1 a1Var : v0Var.L) {
                a1Var.l();
                q2.g gVar = a1Var.h;
                if (gVar != null) {
                    gVar.c(a1Var.e);
                    a1Var.h = null;
                    a1Var.g = null;
                }
            }
        }
        v0Var.y.e(v0Var);
        v0Var.H.removeCallbacksAndMessages(null);
        v0Var.I = null;
        v0Var.h0 = true;
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
        boolean z9 = this.p;
        boolean z10 = this.q;
        e2.l0 i7 = i();
        e2.l1 h1Var = new h1(-9223372036854775807L, -9223372036854775807L, j3, j3, 0L, 0L, z9, false, false, null, i7, z10 ? i7.c : null);
        if (this.n) {
            h1Var = new u(h1Var, 1);
        }
        n(h1Var);
    }

    public final void v(long j3, f3.c0 c0Var, boolean z9) {
        if (this.r && c0Var.e()) {
            return;
        }
        this.r = !c0Var.e();
        if (j3 == -9223372036854775807L) {
            j3 = this.o;
        }
        boolean d = c0Var.d();
        if (!this.n && this.o == j3 && this.p == d && this.q == z9) {
            return;
        }
        this.o = j3;
        this.p = d;
        this.q = z9;
        this.n = false;
        u();
    }

    @Override // x2.a
    public final void k() {
    }
}
