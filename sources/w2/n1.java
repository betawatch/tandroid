package w2;

import android.net.Uri;
import b8.zb;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n1 extends a {
    public final i2.n h;
    public final i2.g i;
    public final d2.v j;
    public final kb.a l;
    public final j1 n;
    public final d2.n0 o;
    public i2.d0 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public n1(d2.m0 m0Var, tf.b bVar, kb.a aVar) {
        d2.i0 i0Var;
        this.i = bVar;
        this.l = aVar;
        boolean z10 = true;
        d2.b0 b0Var = new d2.b0();
        d2.e0 e0Var = new d2.e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.e;
        d2.g0 g0Var = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = m0Var.a.toString();
        uri2.getClass();
        g9.i0 q10 = g9.i0.q(g9.i0.u(m0Var));
        if (e0Var.b != null && e0Var.a == null) {
            z10 = false;
        }
        zb.p(z10);
        if (uri != null) {
            i0Var = new d2.i0(uri, null, e0Var.a != null ? new d2.f0(e0Var) : null, null, list, null, q10, -9223372036854775807L);
        } else {
            i0Var = null;
        }
        d2.n0 n0Var = new d2.n0(uri2, new d2.d0(b0Var), i0Var, new d2.h0(g0Var), d2.q0.L, j0Var);
        this.o = n0Var;
        d2.u uVar = new d2.u();
        String str = m0Var.b;
        uVar.r = d2.u0.n(str == null ? "text/x-unknown" : str);
        uVar.d = m0Var.c;
        uVar.e = m0Var.d;
        uVar.f = m0Var.e;
        uVar.b = m0Var.f;
        String str2 = m0Var.g;
        uVar.a = str2 != null ? str2 : null;
        this.j = new d2.v(uVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = m0Var.a;
        zb.k(uri3, "The uri must be set.");
        this.h = new i2.n(uri3, 1, null, map, 0L, -1L, null, 1);
        this.n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, n0Var, null);
    }

    @Override // w2.a
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        return new m1(this.h, this.i, this.p, this.j, this.k, this.l, b(g0Var), this.m, null);
    }

    @Override // w2.a
    public final d2.n0 i() {
        return this.o;
    }

    @Override // w2.a
    public final void m(i2.d0 d0Var) {
        this.p = d0Var;
        n(this.n);
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        ((m1) e0Var).r.e(null);
    }

    @Override // w2.a
    public final void k() {
    }

    @Override // w2.a
    public final void q() {
    }
}
