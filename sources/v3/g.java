package v3;

import c3.a0;
import c3.c0;
import e2.d0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g implements f {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public g(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i10) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j3;
        this.d = j10;
        this.e = j11;
        this.f = i10;
    }

    @Override // v3.f
    public final long a(long j3) {
        return this.a[d0.e(this.b, j3, true)];
    }

    @Override // v3.f
    public final long d() {
        return this.e;
    }

    @Override // v3.f
    public final long e() {
        return this.d;
    }

    @Override // c3.b0
    public final boolean f() {
        return true;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        long[] jArr = this.a;
        int e7 = d0.e(jArr, j3, true);
        long j10 = jArr[e7];
        long[] jArr2 = this.b;
        c0 c0Var = new c0(j10, jArr2[e7]);
        if (j10 >= j3 || e7 == jArr.length - 1) {
            return new a0(c0Var, c0Var);
        }
        int i10 = e7 + 1;
        return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
    }

    @Override // v3.f
    public final int k() {
        return this.f;
    }

    @Override // c3.b0
    public final long l() {
        return this.c;
    }
}
