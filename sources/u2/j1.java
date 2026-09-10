package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class j1 extends b2.k1 {
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
    public final b2.k0 o;
    public final b2.e0 p;

    static {
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        Uri uri = Uri.EMPTY;
        e2.d.g(b0Var.b == null || b0Var.a != null);
        if (uri != null) {
            new b2.f0(uri, null, b0Var.a != null ? new b2.c0(b0Var) : null, null, list, null, a1Var, -9223372036854775807L);
        }
        new b2.a0(yVar);
        new b2.e0(d0Var);
        b2.n0 n0Var = b2.n0.K;
    }

    public j1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, na.d dVar, b2.k0 k0Var, b2.e0 e0Var) {
        this.e = j3;
        this.f = j10;
        this.g = j11;
        this.h = j12;
        this.i = j13;
        this.j = j14;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = dVar;
        k0Var.getClass();
        this.o = k0Var;
        this.p = e0Var;
    }

    @Override // b2.k1
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // b2.k1
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        e2.d.c(i10, 1);
        Object obj = z10 ? q : null;
        long j3 = -this.i;
        h1Var.getClass();
        h1Var.h(null, obj, 0, this.g, j3, b2.b.c, false);
        return h1Var;
    }

    @Override // b2.k1
    public final int h() {
        return 1;
    }

    @Override // b2.k1
    public final Object l(int i10) {
        e2.d.c(i10, 1);
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // b2.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        long j10;
        e2.d.c(i10, 1);
        long j11 = this.j;
        boolean z10 = this.l;
        if (z10 && !this.m && j3 != 0) {
            long j12 = this.h;
            if (j12 != -9223372036854775807L) {
                j11 += j3;
            }
            j10 = -9223372036854775807L;
            j1Var.b(b2.j1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j10, this.h, 0, 0, this.i);
            return j1Var;
        }
        j10 = j11;
        j1Var.b(b2.j1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j10, this.h, 0, 0, this.i);
        return j1Var;
    }

    @Override // b2.k1
    public final int o() {
        return 1;
    }
}
