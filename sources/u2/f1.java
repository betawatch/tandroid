package u2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
