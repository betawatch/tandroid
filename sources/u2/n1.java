package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n1 extends a {
    public final g2.m h;
    public final g2.g i;
    public final b2.s j;
    public final rb.a l;
    public final j1 n;
    public final b2.k0 o;
    public g2.c0 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public n1(b2.j0 j0Var, n4.y yVar, rb.a aVar) {
        b2.f0 f0Var;
        this.i = yVar;
        this.l = aVar;
        boolean z10 = true;
        b2.y yVar2 = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = j0Var.a.toString();
        uri2.getClass();
        e9.i0 v = e9.i0.v(e9.i0.z(j0Var));
        if (b0Var.b != null && b0Var.a == null) {
            z10 = false;
        }
        e2.d.g(z10);
        if (uri != null) {
            f0Var = new b2.f0(uri, null, b0Var.a != null ? new b2.c0(b0Var) : null, null, list, null, v, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0(uri2, new b2.a0(yVar2), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        this.o = k0Var;
        b2.r rVar = new b2.r();
        String str = j0Var.b;
        rVar.q = b2.r0.n(str == null ? "text/x-unknown" : str);
        rVar.d = j0Var.c;
        rVar.e = j0Var.d;
        rVar.f = j0Var.e;
        rVar.b = j0Var.f;
        String str2 = j0Var.g;
        rVar.a = str2 != null ? str2 : null;
        this.j = new b2.s(rVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = j0Var.a;
        e2.d.i(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.n = new j1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, k0Var, null);
    }

    @Override // u2.a
    public final e0 c(g0 g0Var, y2.d dVar, long j3) {
        return new m1(this.h, this.i, this.p, this.j, this.k, this.l, b(g0Var), this.m, null);
    }

    @Override // u2.a
    public final b2.k0 i() {
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
