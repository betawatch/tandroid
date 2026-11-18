package x2;

import a8.la;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class j1 extends e2.l1 {
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
    public final e2.l0 o;
    public final e2.f0 p;

    static {
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        Uri uri = Uri.EMPTY;
        la.p(c0Var.b == null || c0Var.a != null);
        if (uri != null) {
            new e2.g0(uri, null, c0Var.a != null ? new e2.d0(c0Var) : null, null, list, null, t1Var, -9223372036854775807L);
        }
        new e2.b0(zVar);
        new e2.f0(e0Var);
        e2.o0 o0Var = e2.o0.L;
    }

    public j1(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, nb.a aVar, e2.l0 l0Var, e2.f0 f0Var) {
        this.e = j3;
        this.f = j10;
        this.g = j11;
        this.h = j12;
        this.i = j13;
        this.j = j14;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = aVar;
        l0Var.getClass();
        this.o = l0Var;
        this.p = f0Var;
    }

    @Override // e2.l1
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // e2.l1
    public final e2.i1 f(int i7, e2.i1 i1Var, boolean z10) {
        la.j(i7, 1);
        Object obj = z10 ? q : null;
        long j3 = -this.i;
        i1Var.getClass();
        i1Var.h(null, obj, 0, this.g, j3, e2.c.c, false);
        return i1Var;
    }

    @Override // e2.l1
    public final int h() {
        return 1;
    }

    @Override // e2.l1
    public final Object l(int i7) {
        la.j(i7, 1);
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // e2.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e2.k1 m(int i7, e2.k1 k1Var, long j3) {
        long j10;
        la.j(i7, 1);
        long j11 = this.j;
        boolean z10 = this.l;
        if (z10 && !this.m && j3 != 0) {
            long j12 = this.h;
            if (j12 != -9223372036854775807L) {
                j11 += j3;
            }
            j10 = -9223372036854775807L;
            k1Var.b(e2.k1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j10, this.h, 0, 0, this.i);
            return k1Var;
        }
        j10 = j11;
        k1Var.b(e2.k1.q, this.o, this.n, this.e, this.f, -9223372036854775807L, this.k, z10, this.p, j10, this.h, 0, 0, this.i);
        return k1Var;
    }

    @Override // e2.l1
    public final int o() {
        return 1;
    }
}
