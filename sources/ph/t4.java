package ph;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t4 implements cg.o1 {
    public final /* synthetic */ h9 a;

    public t4(h9 h9Var) {
        this.a = h9Var;
    }

    @Override // cg.o1
    public final void b() {
        u4 u4Var = this.a.M0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    @Override // cg.o1
    public final void c() {
        h9 h9Var = this.a;
        if (h9Var.Z0) {
            h9Var.Z0 = false;
        } else {
            h9Var.h1.b(1);
            h9Var.x((cg.m) cg.m.a.get(0));
        }
    }

    @Override // cg.o1
    public final boolean d() {
        h9 h9Var = this.a;
        boolean z4 = h9Var.G0 == null;
        if (!z4) {
            h9Var.D0(null, true);
        }
        return z4;
    }

    @Override // cg.o1
    public final void e() {
        h9 h9Var = this.a;
        h9Var.A0.a.e();
        h9Var.a1.setViewHidden(false);
    }

    @Override // cg.o1
    public final void f() {
        h9 h9Var = this.a;
        if (h9Var.G0 != null) {
            h9Var.D0(null, true);
        }
        h9Var.a1.setViewHidden(true);
    }

    @Override // cg.o1
    public final void a() {
    }
}
