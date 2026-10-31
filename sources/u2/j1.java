package u2;

import android.net.Uri;
import e9.x1;
import java.util.Collections;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j1 extends b2.o1 {
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
    public final b2.p0 o;
    public final b2.j0 p;

    static {
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        x1 x1Var = x1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        Uri uri = Uri.EMPTY;
        t6.p(g0Var.b == null || g0Var.a != null);
        if (uri != null) {
            new b2.k0(uri, null, g0Var.a != null ? new b2.h0(g0Var) : null, null, list, null, x1Var, -9223372036854775807L);
        }
        new b2.f0(d0Var);
        new b2.j0(i0Var);
        b2.s0 s0Var = b2.s0.L;
    }

    public j1(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, kb.a aVar, b2.p0 p0Var, b2.j0 j0Var) {
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
        p0Var.getClass();
        this.o = p0Var;
        this.p = j0Var;
    }

    @Override // b2.o1
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // b2.o1
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        t6.j(i10, 1);
        Object obj = z10 ? q : null;
        long j10 = -this.i;
        l1Var.getClass();
        l1Var.h(null, obj, 0, this.g, j10, b2.c.c, false);
        return l1Var;
    }

    @Override // b2.o1
    public final int h() {
        return 1;
    }

    @Override // b2.o1
    public final Object l(int i10) {
        t6.j(i10, 1);
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // b2.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        long j11;
        t6.j(i10, 1);
        long j12 = this.j;
        boolean z10 = this.l;
        if (z10 && !this.m && j10 != 0) {
            long j13 = this.h;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
            }
            j11 = -9223372036854775807L;
            n1Var.b(b2.n1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j11, this.h, 0, 0, this.i);
            return n1Var;
        }
        j11 = j12;
        n1Var.b(b2.n1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j11, this.h, 0, 0, this.i);
        return n1Var;
    }

    @Override // b2.o1
    public final int o() {
        return 1;
    }
}
