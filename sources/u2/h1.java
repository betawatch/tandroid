package u2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h1 implements i1 {
    public final int a;

    public h1(int i10) {
        this.a = i10;
    }

    @Override // u2.i1
    public final i1 a(int i10, int i11) {
        return new h1((this.a - i11) + i10);
    }

    @Override // u2.i1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // u2.i1
    public final i1 c(int i10) {
        return ((h1) i()).f(0, i10);
    }

    @Override // u2.i1
    public final int d(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.i1
    public final int e(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.i1
    public final i1 f(int i10, int i11) {
        return new h1(this.a + i11);
    }

    @Override // u2.i1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.i1
    public final int h() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.i1
    public final i1 i() {
        return new h1(0);
    }

    @Override // u2.i1
    public final i1 g() {
        return this;
    }
}
