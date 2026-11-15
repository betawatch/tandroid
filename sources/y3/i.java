package y3;

import f3.a0;
import f3.c0;
import h2.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    public final long a() {
        return this.e;
    }

    @Override // y3.h
    public final long b(long j3) {
        return this.a[l0.f(this.b, j3, true)];
    }

    @Override // y3.h
    public final long c() {
        return this.d;
    }

    @Override // f3.b0
    public final boolean d() {
        return true;
    }

    @Override // f3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.b0
    public final a0 f(long j3) {
        long[] jArr = this.a;
        int f10 = l0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.b;
        c0 c0Var = new c0(j10, jArr2[f10]);
        if (j10 >= j3 || f10 == jArr.length - 1) {
            return new a0(c0Var, c0Var);
        }
        int i7 = f10 + 1;
        return new a0(c0Var, new c0(jArr[i7], jArr2[i7]));
    }

    @Override // y3.h
    public final int g() {
        return this.f;
    }

    @Override // f3.b0
    public final long h() {
        return this.c;
    }
}
