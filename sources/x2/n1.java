package x2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n1 implements c1 {
    public final c1 a;
    public final long b;

    public n1(c1 c1Var, long j3) {
        this.a = c1Var;
        this.b = j3;
    }

    @Override // x2.c1
    public final void a() {
        this.a.a();
    }

    @Override // x2.c1
    public final boolean f() {
        return this.a.f();
    }

    @Override // x2.c1
    public final int l(long j3) {
        return this.a.l(j3 - this.b);
    }

    @Override // x2.c1
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        int m10 = this.a.m(bVar, hVar, i7);
        if (m10 == -4) {
            hVar.e += this.b;
        }
        return m10;
    }
}
