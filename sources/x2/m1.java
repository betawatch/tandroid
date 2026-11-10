package x2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m1 implements b1 {
    public final b1 a;
    public final long b;

    public m1(b1 b1Var, long j3) {
        this.a = b1Var;
        this.b = j3;
    }

    @Override // x2.b1
    public final void a() {
        this.a.a();
    }

    @Override // x2.b1
    public final boolean f() {
        return this.a.f();
    }

    @Override // x2.b1
    public final int l(long j3) {
        return this.a.l(j3 - this.b);
    }

    @Override // x2.b1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        int m10 = this.a.m(bVar, hVar, i7);
        if (m10 == -4) {
            hVar.e += this.b;
        }
        return m10;
    }
}
