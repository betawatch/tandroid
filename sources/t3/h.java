package t3;

import d5.f0;
import m3.s;
import m3.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements f {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public h(long j10, int i9, long j11, long j12, long[] jArr) {
        this.a = j10;
        this.b = i9;
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
        int e10 = f0.e(jArr, (long) d, true);
        long j12 = this.c;
        long j13 = (e10 * j12) / 100;
        long j14 = jArr[e10];
        int i9 = e10 + 1;
        long j15 = (j12 * i9) / 100;
        return Math.round((j14 == (e10 == 99 ? 256L : jArr[i9]) ? 0.0d : (d - j14) / (r0 - j14)) * (j15 - j13)) + j13;
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
        double d9;
        boolean e10 = e();
        int i9 = this.b;
        long j11 = this.a;
        if (!e10) {
            u uVar = new u(0L, j11 + i9);
            return new s(uVar, uVar);
        }
        long i10 = f0.i(j10, 0L, this.c);
        double d10 = (i10 * 100.0d) / this.c;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d = 256.0d;
        } else if (d10 >= 100.0d) {
            d = 256.0d;
            d11 = 256.0d;
        } else {
            int i11 = (int) d10;
            long[] jArr = this.f;
            d5.a.j(jArr);
            double d12 = jArr[i11];
            if (i11 == 99) {
                d = 256.0d;
                d9 = 256.0d;
            } else {
                d = 256.0d;
                d9 = jArr[i11 + 1];
            }
            d11 = ((d9 - d12) * (d10 - i11)) + d12;
        }
        long j12 = this.d;
        u uVar2 = new u(i10, j11 + f0.i(Math.round((d11 / d) * j12), i9, j12 - 1));
        return new s(uVar2, uVar2);
    }

    @Override // m3.t
    public final long i() {
        return this.c;
    }
}
