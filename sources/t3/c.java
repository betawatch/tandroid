package t3;

import android.util.Pair;
import d5.g0;
import m3.s;
import m3.u;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements f {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10 == -9223372036854775807L ? g0.H(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair b(long j10, long[] jArr, long[] jArr2) {
        int e9 = g0.e(jArr, j10, true);
        long j11 = jArr[e9];
        long j12 = jArr2[e9];
        int i10 = e9 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // t3.f
    public final long a(long j10) {
        return g0.H(((Long) b(j10, this.a, this.b).second).longValue());
    }

    @Override // t3.f
    public final long d() {
        return -1L;
    }

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.t
    public final s h(long j10) {
        Pair b10 = b(g0.S(g0.i(j10, 0L, this.c)), this.b, this.a);
        u uVar = new u(g0.H(((Long) b10.first).longValue()), ((Long) b10.second).longValue());
        return new s(uVar, uVar);
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
