package u2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
