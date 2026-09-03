package qh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class s4 implements dg.n1 {
    public final /* synthetic */ e9 a;

    public s4(e9 e9Var) {
        this.a = e9Var;
    }

    @Override // dg.n1
    public final void b() {
        t4 t4Var = this.a.M0;
        if (t4Var != null) {
            t4Var.invalidate();
        }
    }

    @Override // dg.n1
    public final void c() {
        e9 e9Var = this.a;
        if (e9Var.Z0) {
            e9Var.Z0 = false;
        } else {
            e9Var.h1.b(1);
            e9Var.g((dg.m) dg.m.a.get(0));
        }
    }

    @Override // dg.n1
    public final boolean d() {
        e9 e9Var = this.a;
        boolean z4 = e9Var.G0 == null;
        if (!z4) {
            e9Var.D0(null, true);
        }
        return z4;
    }

    @Override // dg.n1
    public final void e() {
        e9 e9Var = this.a;
        e9Var.A0.a.e();
        e9Var.a1.setViewHidden(false);
    }

    @Override // dg.n1
    public final void f() {
        e9 e9Var = this.a;
        if (e9Var.G0 != null) {
            e9Var.D0(null, true);
        }
        e9Var.a1.setViewHidden(true);
    }

    @Override // dg.n1
    public final void a() {
    }
}
