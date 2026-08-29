package v3;

import android.util.Pair;
import f5.d0;
import o3.s;
import o3.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements f {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10 == -9223372036854775807L ? d0.H(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair d(long j10, long[] jArr, long[] jArr2) {
        int e10 = d0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long j12 = jArr2[e10];
        int i10 = e10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // v3.f
    public final long a() {
        return -1L;
    }

    @Override // v3.f
    public final long b(long j10) {
        return d0.H(((Long) d(j10, this.a, this.b).second).longValue());
    }

    @Override // o3.t
    public final boolean c() {
        return true;
    }

    @Override // o3.t
    public final s g(long j10) {
        Pair d = d(d0.S(d0.i(j10, 0L, this.c)), this.b, this.a);
        u uVar = new u(d0.H(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new s(uVar, uVar);
    }

    @Override // o3.t
    public final long h() {
        return this.c;
    }
}
