package y3;

import android.util.Pair;
import f3.b0;
import f3.d0;
import h2.m0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class c implements h {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j3, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j3 == -9223372036854775807L ? m0.S(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair i(long j3, long[] jArr, long[] jArr2) {
        int f10 = m0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long j11 = jArr2[f10];
        int i7 = f10 + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) ((jArr[i7] == j10 ? 0.0d : (j3 - j10) / (r6 - j10)) * (jArr2[i7] - j11))) + j11));
    }

    @Override // y3.h
    public final long a(long j3) {
        return m0.S(((Long) i(j3, this.a, this.b).second).longValue());
    }

    @Override // y3.h
    public final long b() {
        return -1L;
    }

    @Override // y3.h
    public final long c() {
        return 0L;
    }

    @Override // f3.c0
    public final boolean d() {
        return true;
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        Pair i7 = i(m0.h0(m0.j(j3, 0L, this.c)), this.b, this.a);
        d0 d0Var = new d0(m0.S(((Long) i7.first).longValue()), ((Long) i7.second).longValue());
        return new b0(d0Var, d0Var);
    }

    @Override // y3.h
    public final int g() {
        return -2147483647;
    }

    @Override // f3.c0
    public final long h() {
        return this.c;
    }
}
