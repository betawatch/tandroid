package u2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
