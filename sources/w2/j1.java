package w2;

import android.net.Uri;
import b8.zb;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 extends d2.n1 {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final d2.n0 o;
    public final d2.h0 p;

    static {
        d2.b0 b0Var = new d2.b0();
        d2.e0 e0Var = new d2.e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.e;
        d2.g0 g0Var = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        Uri uri = Uri.EMPTY;
        zb.p(e0Var.b == null || e0Var.a != null);
        if (uri != null) {
            new d2.i0(uri, null, e0Var.a != null ? new d2.f0(e0Var) : null, null, list, null, s1Var, -9223372036854775807L);
        }
        new d2.d0(b0Var);
        new d2.h0(g0Var);
        d2.q0 q0Var = d2.q0.L;
    }

    public j1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, kb.a aVar, d2.n0 n0Var, d2.h0 h0Var) {
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = j13;
        this.i = j14;
        this.j = j15;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = aVar;
        n0Var.getClass();
        this.o = n0Var;
        this.p = h0Var;
    }

    @Override // d2.n1
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // d2.n1
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        zb.j(i3, 1);
        Object obj = z10 ? q : null;
        long j10 = -this.i;
        k1Var.getClass();
        k1Var.h(null, obj, 0, this.g, j10, d2.c.c, false);
        return k1Var;
    }

    @Override // d2.n1
    public final int h() {
        return 1;
    }

    @Override // d2.n1
    public final Object l(int i3) {
        zb.j(i3, 1);
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // d2.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        long j11;
        zb.j(i3, 1);
        long j12 = this.j;
        boolean z10 = this.l;
        if (z10 && !this.m && j10 != 0) {
            long j13 = this.h;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
            }
            j11 = -9223372036854775807L;
            m1Var.b(d2.m1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j11, this.h, 0, 0, this.i);
            return m1Var;
        }
        j11 = j12;
        m1Var.b(d2.m1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j11, this.h, 0, 0, this.i);
        return m1Var;
    }

    @Override // d2.n1
    public final int o() {
        return 1;
    }
}
