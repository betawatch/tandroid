package u2;

import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class y0 implements x3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public y0(long j10, int i10) {
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
    public long k(c3.p pVar) {
        long j10 = this.b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.b = -1L;
        return j11;
    }

    @Override // x3.g
    public c3.c0 x() {
        u6.p(this.a != -1);
        return new c3.t((c3.u) this.c, this.a, 0);
    }

    public y0(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
