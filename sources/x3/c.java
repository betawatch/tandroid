package x3;

import android.util.Pair;
import e3.a0;
import e3.c0;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements h {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10 == -9223372036854775807L ? n0.S(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair i(long j10, long[] jArr, long[] jArr2) {
        int f10 = n0.f(jArr, j10, true);
        long j11 = jArr[f10];
        long j12 = jArr2[f10];
        int i3 = f10 + 1;
        if (i3 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i3] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i3] - j12))) + j12));
    }

    @Override // x3.h
    public final long a() {
        return -1L;
    }

    @Override // x3.h
    public final long b(long j10) {
        return n0.S(((Long) i(j10, this.a, this.b).second).longValue());
    }

    @Override // x3.h
    public final long c() {
        return 0L;
    }

    @Override // e3.b0
    public final boolean d() {
        return true;
    }

    @Override // e3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // e3.b0
    public final a0 f(long j10) {
        Pair i3 = i(n0.h0(n0.j(j10, 0L, this.c)), this.b, this.a);
        c0 c0Var = new c0(n0.S(((Long) i3.first).longValue()), ((Long) i3.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override // x3.h
    public final int g() {
        return -2147483647;
    }

    @Override // e3.b0
    public final long h() {
        return this.c;
    }
}
