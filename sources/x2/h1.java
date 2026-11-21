package x2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class h1 implements i1 {
    public final int a;

    public h1(int i7) {
        this.a = i7;
    }

    @Override // x2.i1
    public final i1 a(int i7, int i10) {
        return new h1((this.a - i10) + i7);
    }

    @Override // x2.i1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // x2.i1
    public final i1 c(int i7) {
        return ((h1) i()).f(0, i7);
    }

    @Override // x2.i1
    public final int d(int i7) {
        int i10 = i7 - 1;
        if (i10 >= 0) {
            return i10;
        }
        return -1;
    }

    @Override // x2.i1
    public final int e(int i7) {
        int i10 = i7 + 1;
        if (i10 < this.a) {
            return i10;
        }
        return -1;
    }

    @Override // x2.i1
    public final i1 f(int i7, int i10) {
        return new h1(this.a + i10);
    }

    @Override // x2.i1
    public final int getLength() {
        return this.a;
    }

    @Override // x2.i1
    public final int h() {
        int i7 = this.a;
        if (i7 > 0) {
            return i7 - 1;
        }
        return -1;
    }

    @Override // x2.i1
    public final i1 i() {
        return new h1(0);
    }

    @Override // x2.i1
    public final i1 g() {
        return this;
    }
}
