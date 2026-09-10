package u2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.i1
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.i1
    public final i1 e(int i10, int i11) {
        return new h1(this.a + i11);
    }

    @Override // u2.i1
    public final int g() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.i1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.i1
    public final i1 h() {
        return new h1(0);
    }

    @Override // u2.i1
    public final i1 f() {
        return this;
    }
}
