package x2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
