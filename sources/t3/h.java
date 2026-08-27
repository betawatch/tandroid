package t3;

import d5.g0;
import m3.s;
import m3.u;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // t3.f
    public final long a(long j10) {
        long j11 = j10 - this.a;
        if (!e() || j11 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        d5.a.j(jArr);
        double d = (j11 * 256.0d) / this.d;
        int e9 = g0.e(jArr, (long) d, true);
        long j12 = this.c;
        long j13 = (e9 * j12) / 100;
        long j14 = jArr[e9];
        int i10 = e9 + 1;
        long j15 = (j12 * i10) / 100;
        return Math.round((j14 == (e9 == 99 ? 256L : jArr[i10]) ? 0.0d : (d - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // t3.f
    public final long d() {
        return this.e;
    }

    @Override // m3.t
    public final boolean e() {
        return this.f != null;
    }

    @Override // m3.t
    public final s h(long j10) {
        double d;
        double d10;
        boolean e9 = e();
        int i10 = this.b;
        long j11 = this.a;
        if (!e9) {
            u uVar = new u(0L, j11 + i10);
            return new s(uVar, uVar);
        }
        long i11 = g0.i(j10, 0L, this.c);
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
            d5.a.j(jArr);
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
        u uVar2 = new u(i11, j11 + g0.i(Math.round((d12 / d) * j12), i10, j12 - 1));
        return new s(uVar2, uVar2);
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
