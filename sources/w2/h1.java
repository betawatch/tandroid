package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h1 implements i1 {
    public final int a;

    public h1(int i3) {
        this.a = i3;
    }

    @Override // w2.i1
    public final i1 a(int i3, int i10) {
        return new h1((this.a - i10) + i3);
    }

    @Override // w2.i1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // w2.i1
    public final i1 c(int i3) {
        return ((h1) i()).f(0, i3);
    }

    @Override // w2.i1
    public final int d(int i3) {
        int i10 = i3 - 1;
        if (i10 >= 0) {
            return i10;
        }
        return -1;
    }

    @Override // w2.i1
    public final int e(int i3) {
        int i10 = i3 + 1;
        if (i10 < this.a) {
            return i10;
        }
        return -1;
    }

    @Override // w2.i1
    public final i1 f(int i3, int i10) {
        return new h1(this.a + i10);
    }

    @Override // w2.i1
    public final int getLength() {
        return this.a;
    }

    @Override // w2.i1
    public final int h() {
        int i3 = this.a;
        if (i3 > 0) {
            return i3 - 1;
        }
        return -1;
    }

    @Override // w2.i1
    public final i1 i() {
        return new h1(0);
    }

    @Override // w2.i1
    public final i1 g() {
        return this;
    }
}
