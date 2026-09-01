package r3;

import h5.d0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q implements s {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public q(long j10, long[] jArr, long[] jArr2) {
        h5.a.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z4 = length > 0;
        this.d = z4;
        if (!z4 || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.a = jArr3;
            long[] jArr4 = new long[i10];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j10;
    }

    @Override // r3.s
    public final boolean c() {
        return this.d;
    }

    @Override // r3.s
    public final r f(long j10) {
        if (!this.d) {
            t tVar = t.c;
            return new r(tVar, tVar);
        }
        long[] jArr = this.b;
        int e6 = d0.e(jArr, j10, true);
        long j11 = jArr[e6];
        long[] jArr2 = this.a;
        t tVar2 = new t(j11, jArr2[e6]);
        if (j11 == j10 || e6 == jArr.length - 1) {
            return new r(tVar2, tVar2);
        }
        int i10 = e6 + 1;
        return new r(tVar2, new t(jArr[i10], jArr2[i10]));
    }

    @Override // r3.s
    public final long g() {
        return this.c;
    }
}
