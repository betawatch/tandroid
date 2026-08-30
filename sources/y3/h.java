package y3;

import h5.d0;
import r3.r;
import r3.t;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h implements f {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public h(long j10, int i10, long j11, long j12, long[] jArr) {
        this.a = j10;
        this.b = i10;
        this.c = j11;
        this.f = jArr;
        this.d = j12;
        this.e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // y3.f
    public final long a(long j10) {
        long j11 = j10 - this.a;
        if (!c() || j11 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        h5.a.j(jArr);
        double d = (j11 * 256.0d) / this.d;
        int e = d0.e(jArr, (long) d, true);
        long j12 = this.c;
        long j13 = (e * j12) / 100;
        long j14 = jArr[e];
        int i10 = e + 1;
        long j15 = (j12 * i10) / 100;
        return Math.round((j14 == (e == 99 ? 256L : jArr[i10]) ? 0.0d : (d - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // y3.f
    public final long b() {
        return this.e;
    }

    @Override // r3.s
    public final boolean c() {
        return this.f != null;
    }

    @Override // r3.s
    public final r f(long j10) {
        double d;
        double d10;
        boolean c3 = c();
        int i10 = this.b;
        long j11 = this.a;
        if (!c3) {
            t tVar = new t(0L, j11 + i10);
            return new r(tVar, tVar);
        }
        long i11 = d0.i(j10, 0L, this.c);
        double d11 = (i11 * 100.0d) / this.c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d = 256.0d;
        } else if (d11 >= 100.0d) {
            d = 256.0d;
            d12 = 256.0d;
        } else {
            int i12 = (int) d11;
            long[] jArr = this.f;
            h5.a.j(jArr);
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
        long j12 = this.d;
        t tVar2 = new t(i11, j11 + d0.i(Math.round((d12 / d) * j12), i10, j12 - 1));
        return new r(tVar2, tVar2);
    }

    @Override // r3.s
    public final long g() {
        return this.c;
    }
}
