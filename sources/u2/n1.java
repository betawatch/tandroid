package u2;

import a8.yb;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n1 extends a {
    public final g2.m h;
    public final g2.g i;
    public final b2.x j;
    public final u7.s l;
    public final j1 n;
    public final b2.p0 o;
    public g2.c0 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public n1(b2.o0 o0Var, rf.b bVar, u7.s sVar) {
        b2.k0 k0Var;
        this.i = bVar;
        this.l = sVar;
        boolean z10 = true;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var = f9.s1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = o0Var.a.toString();
        uri2.getClass();
        f9.i0 u10 = f9.i0.u(f9.i0.y(o0Var));
        if (g0Var.b != null && g0Var.a == null) {
            z10 = false;
        }
        yb.p(z10);
        if (uri != null) {
            k0Var = new b2.k0(uri, null, g0Var.a != null ? new b2.h0(g0Var) : null, null, list, null, u10, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        b2.p0 p0Var = new b2.p0(uri2, new b2.f0(d0Var), k0Var, new b2.j0(i0Var), b2.s0.L, l0Var);
        this.o = p0Var;
        b2.w wVar = new b2.w();
        String str = o0Var.b;
        wVar.r = b2.w0.n(str == null ? "text/x-unknown" : str);
        wVar.d = o0Var.c;
        wVar.e = o0Var.d;
        wVar.f = o0Var.e;
        wVar.b = o0Var.f;
        String str2 = o0Var.g;
        wVar.a = str2 != null ? str2 : null;
        this.j = new b2.x(wVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = o0Var.a;
        yb.l(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, p0Var, null);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        return new m1(this.h, this.i, this.p, this.j, this.k, this.l, b(g0Var), this.m, null);
    }

    @Override // u2.a
    public final b2.p0 i() {
        return this.o;
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.p = c0Var;
        n(this.n);
    }

    @Override // u2.a
    public final void o(e0 e0Var) {
        ((m1) e0Var).r.e(null);
    }

    @Override // u2.a
    public final void k() {
    }

    @Override // u2.a
    public final void q() {
    }
}
