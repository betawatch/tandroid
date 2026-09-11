package v3;

import c3.a0;
import c3.c0;
import e2.d0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class h implements f {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public h(long j3, int i10, long j10, int i11, long j11, long[] jArr) {
        this.a = j3;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        this.e = j11;
        this.g = jArr;
        this.f = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override // v3.f
    public final long a(long j3) {
        long j10 = j3 - this.a;
        if (!f() || j10 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        e2.d.h(jArr);
        double d = (j10 * 256.0d) / this.e;
        int e7 = d0.e(jArr, (long) d, true);
        long j11 = this.c;
        long j12 = (e7 * j11) / 100;
        long j13 = jArr[e7];
        int i10 = e7 + 1;
        long j14 = (j11 * i10) / 100;
        return Math.round((j13 == (e7 == 99 ? 256L : jArr[i10]) ? 0.0d : (d - j13) / (r0 - j13)) * (j14 - j12)) + j12;
    }

    @Override // v3.f
    public final long d() {
        return this.f;
    }

    @Override // v3.f
    public final long e() {
        return this.a + this.b;
    }

    @Override // c3.b0
    public final boolean f() {
        return this.g != null;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        double d;
        double d10;
        boolean f7 = f();
        int i10 = this.b;
        long j10 = this.a;
        if (!f7) {
            c0 c0Var = new c0(0L, j10 + i10);
            return new a0(c0Var, c0Var);
        }
        long i11 = d0.i(j3, 0L, this.c);
        double d11 = (i11 * 100.0d) / this.c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i12 = (int) d11;
            long[] jArr = this.g;
            e2.d.h(jArr);
            double d13 = jArr[i12];
            if (i12 == 99) {
                d = 256.0d;
                d10 = 256.0d;
            } else {
                d = 256.0d;
                d10 = jArr[i12 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i12)) + d13;
        }
        long j11 = this.e;
        c0 c0Var2 = new c0(i11, j10 + d0.i(Math.round((d12 / d) * j11), i10, j11 - 1));
        return new a0(c0Var2, c0Var2);
    }

    @Override // v3.f
    public final int k() {
        return this.d;
    }

    @Override // c3.b0
    public final long l() {
        return this.c;
    }
}
