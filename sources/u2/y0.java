package u2;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class y0 implements x3.g {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public y0(long j3, int i10) {
        e2.d.g(((y2.a) this.c) == null);
        this.a = j3;
        this.b = j3 + i10;
    }

    @Override // x3.g
    public void B(long j3) {
        long[] jArr = (long[]) ((of.b) this.d).b;
        this.b = jArr[e2.d0.e(jArr, j3, true)];
    }

    @Override // x3.g
    public long b(c3.p pVar) {
        long j3 = this.b;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.b = -1L;
        return j10;
    }

    @Override // x3.g
    public c3.b0 g() {
        e2.d.g(this.a != -1);
        return new c3.t((c3.u) this.c, this.a, 0);
    }

    public y0(String str, byte[] bArr, long j3, long j10) {
        this.c = str;
        this.d = bArr;
        this.a = j3;
        this.b = j10;
    }
}
