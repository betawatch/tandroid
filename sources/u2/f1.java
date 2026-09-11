package u2;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f1 implements g1 {
    public final int a;

    public f1(int i10) {
        this.a = i10;
    }

    @Override // u2.g1
    public final g1 a(int i10, int i11) {
        return new f1((this.a - i11) + i10);
    }

    @Override // u2.g1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // u2.g1
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // u2.g1
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // u2.g1
    public final g1 e(int i10, int i11) {
        return new f1(this.a + i11);
    }

    @Override // u2.g1
    public final int g() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // u2.g1
    public final int getLength() {
        return this.a;
    }

    @Override // u2.g1
    public final g1 h() {
        return new f1(0);
    }

    @Override // u2.g1
    public final g1 f() {
        return this;
    }
}
