package y3;

import f3.b0;
import f3.d0;
import h2.m0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class i implements h {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public i(long[] jArr, long[] jArr2, long j3, long j10, long j11, int i7) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j3;
        this.d = j10;
        this.e = j11;
        this.f = i7;
    }

    @Override // y3.h
    public final long a(long j3) {
        return this.a[m0.f(this.b, j3, true)];
    }

    @Override // y3.h
    public final long b() {
        return this.e;
    }

    @Override // y3.h
    public final long c() {
        return this.d;
    }

    @Override // f3.c0
    public final boolean d() {
        return true;
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        long[] jArr = this.a;
        int f10 = m0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.b;
        d0 d0Var = new d0(j10, jArr2[f10]);
        if (j10 >= j3 || f10 == jArr.length - 1) {
            return new b0(d0Var, d0Var);
        }
        int i7 = f10 + 1;
        return new b0(d0Var, new d0(jArr[i7], jArr2[i7]));
    }

    @Override // y3.h
    public final int g() {
        return this.f;
    }

    @Override // f3.c0
    public final long h() {
        return this.c;
    }
}
