package v3;

import android.util.Pair;
import c3.a0;
import c3.c0;
import e2.d0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c implements f {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j3, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j3 == -9223372036854775807L ? d0.Q(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair b(long j3, long[] jArr, long[] jArr2) {
        int e = d0.e(jArr, j3, true);
        long j10 = jArr[e];
        long j11 = jArr2[e];
        int i10 = e + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) ((jArr[i10] == j10 ? 0.0d : (j3 - j10) / (r6 - j10)) * (jArr2[i10] - j11))) + j11));
    }

    @Override // v3.f
    public final long a(long j3) {
        return d0.Q(((Long) b(j3, this.a, this.b).second).longValue());
    }

    @Override // v3.f
    public final long d() {
        return -1L;
    }

    @Override // v3.f
    public final long e() {
        return 0L;
    }

    @Override // c3.b0
    public final boolean f() {
        return true;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        Pair b10 = b(d0.e0(d0.i(j3, 0L, this.c)), this.b, this.a);
        c0 c0Var = new c0(d0.Q(((Long) b10.first).longValue()), ((Long) b10.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override // v3.f
    public final int k() {
        return -2147483647;
    }

    @Override // c3.b0
    public final long l() {
        return this.c;
    }
}
