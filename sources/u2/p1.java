package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class p1 extends a {
    public final g2.m h;
    public final g2.g i;
    public final b2.w j;
    public final oa.d l;
    public final l1 n;
    public final b2.o0 o;
    public g2.c0 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public p1(b2.n0 n0Var, qf.b bVar, oa.d dVar) {
        b2.j0 j0Var;
        this.i = bVar;
        this.l = dVar;
        boolean z10 = true;
        b2.c0 c0Var = new b2.c0();
        b2.f0 f0Var = new b2.f0();
        List list = Collections.EMPTY_LIST;
        x1 x1Var = x1.e;
        b2.h0 h0Var = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = n0Var.a.toString();
        uri2.getClass();
        e9.n0 u10 = e9.n0.u(e9.n0.y(n0Var));
        if (f0Var.b != null && f0Var.a == null) {
            z10 = false;
        }
        u6.p(z10);
        if (uri != null) {
            j0Var = new b2.j0(uri, null, f0Var.a != null ? new b2.g0(f0Var) : null, null, list, null, u10, -9223372036854775807L);
        } else {
            j0Var = null;
        }
        b2.o0 o0Var = new b2.o0(uri2, new b2.e0(c0Var), j0Var, new b2.i0(h0Var), b2.r0.L, k0Var);
        this.o = o0Var;
        b2.v vVar = new b2.v();
        String str = n0Var.b;
        vVar.r = b2.v0.n(str == null ? "text/x-unknown" : str);
        vVar.d = n0Var.c;
        vVar.e = n0Var.d;
        vVar.f = n0Var.e;
        vVar.b = n0Var.f;
        String str2 = n0Var.g;
        vVar.a = str2 != null ? str2 : null;
        this.j = new b2.w(vVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = n0Var.a;
        u6.l(uri3, "The uri must be set.");
        this.h = new g2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.n = new l1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, o0Var, null);
    }

    @Override // u2.a
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        return new o1(this.h, this.i, this.p, this.j, this.k, this.l, b(h0Var), this.m, null);
    }

    @Override // u2.a
    public final b2.o0 i() {
        return this.o;
    }

    @Override // u2.a
    public final void m(g2.c0 c0Var) {
        this.p = c0Var;
        n(this.n);
    }

    @Override // u2.a
    public final void o(f0 f0Var) {
        ((o1) f0Var).r.e(null);
    }

    @Override // u2.a
    public final void k() {
    }

    @Override // u2.a
    public final void q() {
    }
}
