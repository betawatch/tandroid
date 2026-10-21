package u2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class p1 implements e1 {
    public final e1 a;
    public final long b;

    public p1(e1 e1Var, long j10) {
        this.a = e1Var;
        this.b = j10;
    }

    @Override // u2.e1
    public final void a() {
        this.a.a();
    }

    @Override // u2.e1
    public final boolean f() {
        return this.a.f();
    }

    @Override // u2.e1
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        int g10 = this.a.g(bVar, hVar, i10);
        if (g10 == -4) {
            hVar.e += this.b;
        }
        return g10;
    }

    @Override // u2.e1
    public final int m(long j10) {
        return this.a.m(j10 - this.b);
    }
}
