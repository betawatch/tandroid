package u2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g1 implements h1 {
    public final int a;

    public g1(int i10) {
        this.a = i10;
    }

    @Override // u2.h1
    public final h1 a(int i10, int i11) {
        return new g1((this.a - i11) + i10);
    }

    @Override // u2.h1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // u2.h1
    public final h1 c(int i10) {
        return ((g1) i()).f(0, i10);
    }

    @Override // u2.h1
    public final int d(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.h1
    public final int e(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.h1
    public final h1 f(int i10, int i11) {
        return new g1(this.a + i11);
    }

    @Override // u2.h1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.h1
    public final int h() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.h1
    public final h1 i() {
        return new g1(0);
    }

    @Override // u2.h1
    public final h1 g() {
        return this;
    }
}
