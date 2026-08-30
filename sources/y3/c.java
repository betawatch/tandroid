package y3;

import android.util.Pair;
import h5.d0;
import r3.r;
import r3.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements f {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10 == -9223372036854775807L ? d0.G(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair d(long j10, long[] jArr, long[] jArr2) {
        int e = d0.e(jArr, j10, true);
        long j11 = jArr[e];
        long j12 = jArr2[e];
        int i10 = e + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // y3.f
    public final long a(long j10) {
        return d0.G(((Long) d(j10, this.a, this.b).second).longValue());
    }

    @Override // y3.f
    public final long b() {
        return -1L;
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.s
    public final r f(long j10) {
        Pair d = d(d0.S(d0.i(j10, 0L, this.c)), this.b, this.a);
        t tVar = new t(d0.G(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new r(tVar, tVar);
    }

    @Override // r3.s
    public final long g() {
        return this.c;
    }
}
