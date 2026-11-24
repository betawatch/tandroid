// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vu extends k11 {
    public final /* synthetic */ byte d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public vu(iv1 iv1Var, k47 k47Var, rc2 rc2Var) {
        this.g = iv1Var;
        this.e = k47Var;
        this.f = rc2Var;
    }

    @Override // k11
    public final void b() {
        switch (this.d) {
            case 0:
                ui5 ui5Var = (ui5) this.e;
                ui5Var.c.m(ui5Var.w, true);
                View view = ui5Var.s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                break;
            default:
                super.b();
                break;
        }
    }

    @Override // k11
    public final void c(boolean z) {
        switch (this.d) {
            case 1:
                if (!z) {
                    gm.d3(new pp1(((iv1) this.g).a, (byte) 16), 250L);
                    break;
                }
                break;
            default:
                super.c(z);
                break;
        }
    }

    @Override // k11
    public final void d() {
        byte b = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                m66 m66Var = (m66) obj3;
                ui5 ui5Var = (ui5) obj2;
                ui5Var.getClass();
                i66 i66Var = ui5Var.c;
                bx bxVar = (bx) obj;
                ui5Var.s = bxVar != null ? bxVar.b : null;
                i66Var.m(ui5Var.w, true);
                if (bxVar != null) {
                    ui5Var.w = i66.j(bxVar.d, m66Var.i, 0.0f);
                    int w0 = cmb.w0(null, cmb.Be, false);
                    ui5Var.w.g(cmb.p1(0.8f, w0), cmb.p1(1.3f, w0), cmb.p1(1.0f, w0), cmb.p1(4.0f, w0));
                    ui5Var.w.x.setStrokeWidth(gm.N(1.25f));
                    i66Var.b(ui5Var.w, bxVar);
                }
                View view = ui5Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                yv1 yv1Var = ((iv1) obj3).a;
                yv1Var.kc = ((k47) obj2).e1();
                yv1Var.lc = 0;
                yv1Var.mc = null;
                ((rc2) obj).invalidate();
                break;
        }
    }

    public vu(ui5 ui5Var, bx bxVar, m66 m66Var) {
        this.e = ui5Var;
        this.f = bxVar;
        this.g = m66Var;
    }
}
