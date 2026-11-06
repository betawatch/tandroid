package y3;

import f3.b0;
import f3.d0;
import h2.m0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j implements h {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public j(long j3, int i7, long j10, int i10, long j11, long[] jArr) {
        this.a = j3;
        this.b = i7;
        this.c = j10;
        this.d = i10;
        this.e = j11;
        this.g = jArr;
        this.f = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override // y3.h
    public final long a(long j3) {
        long j10 = j3 - this.a;
        if (!d() || j10 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j10 * 256.0d) / this.e;
        int f10 = m0.f(jArr, (long) d, true);
        long j11 = this.c;
        long j12 = (f10 * j11) / 100;
        long j13 = jArr[f10];
        int i7 = f10 + 1;
        long j14 = (j11 * i7) / 100;
        return Math.round((j13 == (f10 == 99 ? 256L : jArr[i7]) ? 0.0d : (d - j13) / (r0 - j13)) * (j14 - j12)) + j12;
    }

    @Override // y3.h
    public final long b() {
        return this.f;
    }

    @Override // y3.h
    public final long c() {
        return this.a + this.b;
    }

    @Override // f3.c0
    public final boolean d() {
        return this.g != null;
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        double d;
        double d2;
        boolean d10 = d();
        int i7 = this.b;
        long j10 = this.a;
        if (!d10) {
            d0 d0Var = new d0(0L, j10 + i7);
            return new b0(d0Var, d0Var);
        }
        long j11 = m0.j(j3, 0L, this.c);
        double d11 = (j11 * 100.0d) / this.c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = this.g;
            jArr.getClass();
            double d13 = jArr[i10];
            if (i10 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i10 + 1];
            }
            d12 = ((d2 - d13) * (d11 - i10)) + d13;
        }
        long j12 = this.e;
        d0 d0Var2 = new d0(j11, j10 + m0.j(Math.round((d12 / d) * j12), i7, j12 - 1));
        return new b0(d0Var2, d0Var2);
    }

    @Override // y3.h
    public final int g() {
        return this.d;
    }

    @Override // f3.c0
    public final long h() {
        return this.c;
    }
}
