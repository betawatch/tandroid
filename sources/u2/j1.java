package u2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class j1 implements k1 {
    public final int a;

    public j1(int i10) {
        this.a = i10;
    }

    @Override // u2.k1
    public final k1 a(int i10, int i11) {
        return new j1((this.a - i11) + i10);
    }

    @Override // u2.k1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // u2.k1
    public final k1 c(int i10) {
        return ((j1) i()).f(0, i10);
    }

    @Override // u2.k1
    public final int d(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.k1
    public final int e(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.k1
    public final k1 f(int i10, int i11) {
        return new j1(this.a + i11);
    }

    @Override // u2.k1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.k1
    public final int h() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.k1
    public final k1 i() {
        return new j1(0);
    }

    @Override // u2.k1
    public final k1 g() {
        return this;
    }
}
