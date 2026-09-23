package u2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class e1 implements f1 {
    public final int a;

    public e1(int i10) {
        this.a = i10;
    }

    @Override // u2.f1
    public final f1 a(int i10, int i11) {
        return new e1((this.a - i11) + i10);
    }

    @Override // u2.f1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // u2.f1
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.f1
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.f1
    public final f1 e(int i10, int i11) {
        return new e1(this.a + i11);
    }

    @Override // u2.f1
    public final int g() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.f1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.f1
    public final f1 h() {
        return new e1(0);
    }

    @Override // u2.f1
    public final f1 f() {
        return this;
    }
}
