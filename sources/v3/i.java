package v3;

import c3.d0;
import c3.f0;
import e2.m0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class i implements h {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10;
        this.d = j11;
        this.e = j12;
        this.f = i10;
    }

    @Override // v3.h
    public final long a() {
        return this.e;
    }

    @Override // v3.h
    public final long b(long j10) {
        return this.a[m0.f(this.b, j10, true)];
    }

    @Override // v3.h
    public final long c() {
        return this.d;
    }

    @Override // c3.e0
    public final boolean d() {
        return true;
    }

    @Override // c3.e0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.e0
    public final d0 f(long j10) {
        long[] jArr = this.a;
        int f7 = m0.f(jArr, j10, true);
        long j11 = jArr[f7];
        long[] jArr2 = this.b;
        f0 f0Var = new f0(j11, jArr2[f7]);
        if (j11 >= j10 || f7 == jArr.length - 1) {
            return new d0(f0Var, f0Var);
        }
        int i10 = f7 + 1;
        return new d0(f0Var, new f0(jArr[i10], jArr2[i10]));
    }

    @Override // v3.h
    public final int g() {
        return this.f;
    }

    @Override // c3.e0
    public final long h() {
        return this.c;
    }
}
