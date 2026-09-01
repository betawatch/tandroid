package qh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class t4 implements dg.n1 {
    public final /* synthetic */ f9 a;

    public t4(f9 f9Var) {
        this.a = f9Var;
    }

    @Override // dg.n1
    public final void b() {
        u4 u4Var = this.a.M0;
        if (u4Var != null) {
            u4Var.invalidate();
        }
    }

    @Override // dg.n1
    public final void c() {
        f9 f9Var = this.a;
        if (f9Var.Z0) {
            f9Var.Z0 = false;
        } else {
            f9Var.h1.b(1);
            f9Var.g((dg.m) dg.m.a.get(0));
        }
    }

    @Override // dg.n1
    public final boolean d() {
        f9 f9Var = this.a;
        boolean z4 = f9Var.G0 == null;
        if (!z4) {
            f9Var.D0(null, true);
        }
        return z4;
    }

    @Override // dg.n1
    public final void e() {
        f9 f9Var = this.a;
        f9Var.A0.a.e();
        f9Var.a1.setViewHidden(false);
    }

    @Override // dg.n1
    public final void f() {
        f9 f9Var = this.a;
        if (f9Var.G0 != null) {
            f9Var.D0(null, true);
        }
        f9Var.a1.setViewHidden(true);
    }

    @Override // dg.n1
    public final void a() {
    }
}
