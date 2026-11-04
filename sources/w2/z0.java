package w2;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z0 implements z3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public z0(long j10, int i3) {
        zb.p(((a3.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i3;
    }

    @Override // z3.g
    public long D(e3.p pVar) {
        long j10 = this.b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.b = -1L;
        return j11;
    }

    @Override // z3.g
    public e3.b0 O() {
        zb.p(this.a != -1);
        return new e3.t((e3.u) this.c, this.a, 0);
    }

    @Override // z3.g
    public void u0(long j10) {
        long[] jArr = (long[]) ((tf.b) this.d).a;
        this.b = jArr[g2.n0.f(jArr, j10, true)];
    }

    public z0(String str, byte[] bArr, long j10, long j11) {
        this.c = str;
        this.d = bArr;
        this.a = j10;
        this.b = j11;
    }
}
