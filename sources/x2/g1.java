package x2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
