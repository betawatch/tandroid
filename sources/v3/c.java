package v3;

import android.util.Pair;
import c3.d0;
import c3.f0;
import e2.m0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

    @Override // c3.e0
    public final boolean d() {
        return true;
    }

    @Override // c3.e0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.e0
    public final d0 f(long j10) {
        Pair i10 = i(m0.h0(m0.j(j10, 0L, this.c)), this.b, this.a);
        f0 f0Var = new f0(m0.S(((Long) i10.first).longValue()), ((Long) i10.second).longValue());
        return new d0(f0Var, f0Var);
    }

    @Override // v3.h
    public final int g() {
        return -2147483647;
    }

    @Override // c3.e0
    public final long h() {
        return this.c;
    }
}
