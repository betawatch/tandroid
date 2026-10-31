package u2;

import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z0 implements x3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public z0(long j10, int i10) {
        t6.p(((y2.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i10;
    }

    @Override // x3.g
    public c3.b0 E() {
        t6.p(this.a != -1);
        return new c3.t((c3.u) this.c, this.a, 0);
    }

    @Override // x3.g
    public void b0(long j10) {
        long[] jArr = (long[]) ((hf.b) this.d).b;
        this.b = jArr[e2.l0.f(jArr, j10, true)];
    }

    @Override // x3.g
    public long w(c3.p pVar) {
        long j10 = this.b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.b = -1L;
        return j11;
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
