package y3;

import h5.d0;
import r3.r;
import r3.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class h implements g {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10;
        this.d = j11;
    }

    @Override // y3.g
    public final long a(long j10) {
        return this.a[d0.e(this.b, j10, true)];
    }

    @Override // y3.g
    public final long b() {
        return this.d;
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.s
    public final r f(long j10) {
        long[] jArr = this.a;
        int e6 = d0.e(jArr, j10, true);
        long j11 = jArr[e6];
        long[] jArr2 = this.b;
        t tVar = new t(j11, jArr2[e6]);
        if (j11 >= j10 || e6 == jArr.length - 1) {
            return new r(tVar, tVar);
        }
        int i10 = e6 + 1;
        return new r(tVar, new t(jArr[i10], jArr2[i10]));
    }

    @Override // r3.s
    public final long g() {
        return this.c;
    }
}
