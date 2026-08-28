package t3;

import android.util.Pair;
import d5.f0;
import m3.s;
import m3.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements f {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j10, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10 == -9223372036854775807L ? f0.H(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair b(long j10, long[] jArr, long[] jArr2) {
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long j12 = jArr2[e10];
        int i9 = e10 + 1;
        if (i9 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i9] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i9] - j12))) + j12));
    }

    @Override // t3.f
    public final long a(long j10) {
        return f0.H(((Long) b(j10, this.a, this.b).second).longValue());
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
        Pair b10 = b(f0.S(f0.i(j10, 0L, this.c)), this.b, this.a);
        u uVar = new u(f0.H(((Long) b10.first).longValue()), ((Long) b10.second).longValue());
        return new s(uVar, uVar);
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
