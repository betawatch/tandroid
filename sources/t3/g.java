package t3;

import d5.g0;
import m3.s;
import m3.u;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // t3.f
    public final long a(long j10) {
        return this.a[g0.e(this.b, j10, true)];
    }

    @Override // t3.f
    public final long d() {
        return this.d;
    }

    @Override // m3.t
    public final boolean e() {
        return true;
    }

    @Override // m3.t
    public final s h(long j10) {
        long[] jArr = this.a;
        int e9 = g0.e(jArr, j10, true);
        long j11 = jArr[e9];
        long[] jArr2 = this.b;
        u uVar = new u(j11, jArr2[e9]);
        if (j11 >= j10 || e9 == jArr.length - 1) {
            return new s(uVar, uVar);
        }
        int i10 = e9 + 1;
        return new s(uVar, new u(jArr[i10], jArr2[i10]));
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
