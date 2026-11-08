package x2;

import a8.ia;
import android.net.Uri;
import h9.t1;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m1 extends a {
    public final j2.m h;
    public final j2.g i;
    public final e2.u j;
    public final pb.b l;
    public final i1 n;
    public final e2.l0 o;
    public j2.d0 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public m1(e2.k0 k0Var, j2.n nVar, pb.b bVar) {
        e2.g0 g0Var;
        this.i = nVar;
        this.l = bVar;
        boolean z9 = true;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        t1 t1Var = t1.e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        String uri2 = k0Var.a.toString();
        uri2.getClass();
        h9.i0 q10 = h9.i0.q(h9.i0.u(k0Var));
        if (c0Var.b != null && c0Var.a == null) {
            z9 = false;
        }
        ia.p(z9);
        if (uri != null) {
            g0Var = new e2.g0(uri, null, c0Var.a != null ? new e2.d0(c0Var) : null, null, list, null, q10, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0(uri2, new e2.b0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        this.o = l0Var;
        e2.t tVar = new e2.t();
        String str = k0Var.b;
        tVar.r = e2.s0.n(str == null ? "text/x-unknown" : str);
        tVar.d = k0Var.c;
        tVar.e = k0Var.d;
        tVar.f = k0Var.e;
        tVar.b = k0Var.f;
        String str2 = k0Var.g;
        tVar.a = str2 != null ? str2 : null;
        this.j = new e2.u(tVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = k0Var.a;
        ia.k(uri3, "The uri must be set.");
        this.h = new j2.m(uri3, 1, null, map, 0L, -1L, null, 1);
        this.n = new i1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, l0Var, null);
    }

    @Override // x2.a
    public final e0 c(g0 g0Var, h6.m mVar, long j3) {
        return new l1(this.h, this.i, this.p, this.j, this.k, this.l, b(g0Var), this.m, null);
    }

    @Override // x2.a
    public final e2.l0 i() {
        return this.o;
    }

    @Override // x2.a
    public final void m(j2.d0 d0Var) {
        this.p = d0Var;
        n(this.n);
    }

    @Override // x2.a
    public final void o(e0 e0Var) {
        ((l1) e0Var).r.e(null);
    }

    @Override // x2.a
    public final void k() {
    }

    @Override // x2.a
    public final void q() {
    }
}
