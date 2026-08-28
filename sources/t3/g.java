package t3;

import d5.f0;
import m3.s;
import m3.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        return this.a[f0.e(this.b, j10, true)];
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
        int e10 = f0.e(jArr, j10, true);
        long j11 = jArr[e10];
        long[] jArr2 = this.b;
        u uVar = new u(j11, jArr2[e10]);
        if (j11 >= j10 || e10 == jArr.length - 1) {
            return new s(uVar, uVar);
        }
        int i9 = e10 + 1;
        return new s(uVar, new u(jArr[i9], jArr2[i9]));
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
