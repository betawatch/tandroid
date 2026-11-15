package x2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f1 implements g1 {
    public final int a;

    public f1(int i7) {
        this.a = i7;
    }

    @Override // x2.g1
    public final g1 a(int i7, int i10) {
        return new f1((this.a - i10) + i7);
    }

    @Override // x2.g1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // x2.g1
    public final g1 c(int i7) {
        return ((f1) i()).f(0, i7);
    }

    @Override // x2.g1
    public final int d(int i7) {
        int i10 = i7 - 1;
        if (i10 >= 0) {
            return i10;
        }
        return -1;
    }

    @Override // x2.g1
    public final int e(int i7) {
        int i10 = i7 + 1;
        if (i10 < this.a) {
            return i10;
        }
        return -1;
    }

    @Override // x2.g1
    public final g1 f(int i7, int i10) {
        return new f1(this.a + i10);
    }

    @Override // x2.g1
    public final int getLength() {
        return this.a;
    }

    @Override // x2.g1
    public final int h() {
        int i7 = this.a;
        if (i7 > 0) {
            return i7 - 1;
        }
        return -1;
    }

    @Override // x2.g1
    public final g1 i() {
        return new f1(0);
    }

    @Override // x2.g1
    public final g1 g() {
        return this;
    }
}
