package x3;

import e3.a0;
import e3.c0;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements h {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public i(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j10;
        this.d = j11;
        this.e = j12;
        this.f = i3;
    }

    @Override // x3.h
    public final long a() {
        return this.e;
    }

    @Override // x3.h
    public final long b(long j10) {
        return this.a[n0.f(this.b, j10, true)];
    }

    @Override // x3.h
    public final long c() {
        return this.d;
    }

    @Override // e3.b0
    public final boolean d() {
        return true;
    }

    @Override // e3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // e3.b0
    public final a0 f(long j10) {
        long[] jArr = this.a;
        int f10 = n0.f(jArr, j10, true);
        long j11 = jArr[f10];
        long[] jArr2 = this.b;
        c0 c0Var = new c0(j11, jArr2[f10]);
        if (j11 >= j10 || f10 == jArr.length - 1) {
            return new a0(c0Var, c0Var);
        }
        int i3 = f10 + 1;
        return new a0(c0Var, new c0(jArr[i3], jArr2[i3]));
    }

    @Override // x3.h
    public final int g() {
        return this.f;
    }

    @Override // e3.b0
    public final long h() {
        return this.c;
    }
}
