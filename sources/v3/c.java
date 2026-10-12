package v3;

import android.util.Pair;
import c3.a0;
import c3.c0;
import e2.m0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c implements h {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10 == -9223372036854775807L ? m0.S(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair i(long j10, long[] jArr, long[] jArr2) {
        int f7 = m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long j12 = jArr2[f7];
        int i10 = f7 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // v3.h
    public final long a() {
        return -1L;
    }

    @Override // v3.h
    public final long b(long j10) {
        return m0.S(((Long) i(j10, this.a, this.b).second).longValue());
    }

    @Override // v3.h
    public final long c() {
        return 0L;
    }

    @Override // c3.b0
    public final boolean d() {
        return true;
    }

    @Override // c3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        Pair i10 = i(m0.h0(m0.j(j10, 0L, this.c)), this.b, this.a);
        c0 c0Var = new c0(m0.S(((Long) i10.first).longValue()), ((Long) i10.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override // v3.h
    public final int g() {
        return -2147483647;
    }

    @Override // c3.b0
    public final long h() {
        return this.c;
    }
}
