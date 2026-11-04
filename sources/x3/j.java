package x3;

import e3.a0;
import e3.c0;
import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements h {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public j(long j10, int i3, long j11, int i10, long j12, long[] jArr) {
        this.a = j10;
        this.b = i3;
        this.c = j11;
        this.d = i10;
        this.e = j12;
        this.g = jArr;
        this.f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // x3.h
    public final long a() {
        return this.f;
    }

    @Override // x3.h
    public final long b(long j10) {
        long j11 = j10 - this.a;
        if (!d() || j11 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j11 * 256.0d) / this.e;
        int f10 = n0.f(jArr, (long) d, true);
        long j12 = this.c;
        long j13 = (f10 * j12) / 100;
        long j14 = jArr[f10];
        int i3 = f10 + 1;
        long j15 = (j12 * i3) / 100;
        return Math.round((j14 == (f10 == 99 ? 256L : jArr[i3]) ? 0.0d : (d - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // x3.h
    public final long c() {
        return this.a + this.b;
    }

    @Override // e3.b0
    public final boolean d() {
        return this.g != null;
    }

    @Override // e3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // e3.b0
    public final a0 f(long j10) {
        double d;
        double d10;
        boolean d11 = d();
        int i3 = this.b;
        long j11 = this.a;
        if (!d11) {
            c0 c0Var = new c0(0L, j11 + i3);
            return new a0(c0Var, c0Var);
        }
        long j12 = n0.j(j10, 0L, this.c);
        double d12 = (j12 * 100.0d) / this.c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d = 256.0d;
        } else if (d12 >= 100.0d) {
            d = 256.0d;
            d13 = 256.0d;
        } else {
            int i10 = (int) d12;
            long[] jArr = this.g;
            jArr.getClass();
            double d14 = jArr[i10];
            if (i10 == 99) {
                d = 256.0d;
                d10 = 256.0d;
            } else {
                d = 256.0d;
                d10 = jArr[i10 + 1];
            }
            d13 = ((d10 - d14) * (d12 - i10)) + d14;
        }
        long j13 = this.e;
        c0 c0Var2 = new c0(j12, j11 + n0.j(Math.round((d13 / d) * j13), i3, j13 - 1));
        return new a0(c0Var2, c0Var2);
    }

    @Override // x3.h
    public final int g() {
        return this.d;
    }

    @Override // e3.b0
    public final long h() {
        return this.c;
    }
}
