package u2;

import a8.yb;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class z0 implements x3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public z0(long j10, int i10) {
        yb.p(((y2.a) this.c) == null);
        this.a = j10;
        this.b = j10 + i10;
    }

    @Override // x3.g
    public void N0(long j10) {
        long[] jArr = (long[]) ((rf.b) this.d).b;
        this.b = jArr[e2.n0.f(jArr, j10, true)];
    }

    @Override // x3.g
    public c3.b0 U() {
        yb.p(this.a != -1);
        return new c3.t((c3.u) this.c, this.a, 0);
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
