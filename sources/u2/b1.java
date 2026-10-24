package u2;

import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class b1 implements x3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public b1(long j10, int i10) {
        u6.p(((y2.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i10;
    }

    @Override // x3.g
    public void X(long j10) {
        long[] jArr = (long[]) ((n4.s) this.d).b;
        this.b = jArr[e2.m0.f(jArr, j10, true)];
    }

    @Override // x3.g
    public long k(c3.r rVar) {
        long j10 = this.b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.b = -1L;
        return j11;
    }

    @Override // x3.g
    public c3.e0 x() {
        u6.p(this.a != -1);
        return new c3.v((c3.w) this.c, this.a, 0);
    }

    public b1(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
