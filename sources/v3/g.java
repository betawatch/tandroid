package v3;

import f5.d0;
import o3.s;
import o3.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g implements f {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public g(long[] jArr, long[] jArr2, long j10, long j11) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10;
        this.d = j11;
    }

    @Override // v3.f
    public final long a() {
        return this.d;
    }

    @Override // v3.f
    public final long b(long j10) {
        return this.a[d0.e(this.b, j10, true)];
    }

    @Override // o3.t
    public final boolean c() {
        return true;
    }

    @Override // o3.t
    public final s g(long j10) {
        long[] jArr = this.a;
        int e10 = d0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.b;
        u uVar = new u(j11, jArr2[e10]);
        if (j11 >= j10 || e10 == jArr.length - 1) {
            return new s(uVar, uVar);
        }
        int i10 = e10 + 1;
        return new s(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override // o3.t
    public final long h() {
        return this.c;
    }
}
