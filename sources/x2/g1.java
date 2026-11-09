package x2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class g1 implements h1 {
    public final int a;

    public g1(int i7) {
        this.a = i7;
    }

    @Override // x2.h1
    public final h1 a(int i7, int i10) {
        return new g1((this.a - i10) + i7);
    }

    @Override // x2.h1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // x2.h1
    public final h1 c(int i7) {
        return ((g1) i()).f(0, i7);
    }

    @Override // x2.h1
    public final int d(int i7) {
        int i10 = i7 - 1;
        if (i10 >= 0) {
            return i10;
        }
        return -1;
    }

    @Override // x2.h1
    public final int e(int i7) {
        int i10 = i7 + 1;
        if (i10 < this.a) {
            return i10;
        }
        return -1;
    }

    @Override // x2.h1
    public final h1 f(int i7, int i10) {
        return new g1(this.a + i10);
    }

    @Override // x2.h1
    public final int getLength() {
        return this.a;
    }

    @Override // x2.h1
    public final int h() {
        int i7 = this.a;
        if (i7 > 0) {
            return i7 - 1;
        }
        return -1;
    }

    @Override // x2.h1
    public final h1 i() {
        return new g1(0);
    }

    @Override // x2.h1
    public final h1 g() {
        return this;
    }
}
