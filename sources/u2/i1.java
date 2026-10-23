package u2;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class i1 implements j1 {
    public final int a;

    public i1(int i10) {
        this.a = i10;
    }

    @Override // u2.j1
    public final j1 a(int i10, int i11) {
        return new i1((this.a - i11) + i10);
    }

    @Override // u2.j1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // u2.j1
    public final j1 c(int i10) {
        return ((i1) i()).f(0, i10);
    }

    @Override // u2.j1
    public final int d(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.j1
    public final int e(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.j1
    public final j1 f(int i10, int i11) {
        return new i1(this.a + i11);
    }

    @Override // u2.j1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.j1
    public final int h() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.j1
    public final j1 i() {
        return new i1(0);
    }

    @Override // u2.j1
    public final j1 g() {
        return this;
    }
}
