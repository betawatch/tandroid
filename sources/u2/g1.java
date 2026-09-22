package u2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.h1
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.h1
    public final h1 e(int i10, int i11) {
        return new g1(this.a + i11);
    }

    @Override // u2.h1
    public final int g() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.h1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.h1
    public final h1 h() {
        return new g1(0);
    }

    @Override // u2.h1
    public final h1 f() {
        return this;
    }
}
