// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wt extends l01 {
    public final /* synthetic */ byte d = 1;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public wt(ju1 ju1Var, r47 r47Var, wb2 wb2Var) {
        this.g = ju1Var;
        this.e = r47Var;
        this.f = wb2Var;
    }

    @Override // l01
    public final void b() {
        switch (this.d) {
            case 0:
                xi5 xi5Var = (xi5) this.e;
                xi5Var.c.m(xi5Var.w, true);
                View view = xi5Var.s;
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

    @Override // l01
    public final void c(boolean z) {
        switch (this.d) {
            case 1:
                if (!z) {
                    hl.d3(new zo1(((ju1) this.g).a, (byte) 7), 250L);
                    break;
                }
                break;
            default:
                super.c(z);
                break;
        }
    }

    @Override // l01
    public final void d() {
        byte b = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                q66 q66Var = (q66) obj3;
                xi5 xi5Var = (xi5) obj2;
                xi5Var.getClass();
                m66 m66Var = xi5Var.c;
                cw cwVar = (cw) obj;
                xi5Var.s = cwVar != null ? cwVar.b : null;
                m66Var.m(xi5Var.w, true);
                if (cwVar != null) {
                    xi5Var.w = m66.j(cwVar.d, q66Var.i, 0.0f);
                    int w0 = aob.w0(null, aob.Ce, false);
                    xi5Var.w.g(aob.p1(0.8f, w0), aob.p1(1.3f, w0), aob.p1(1.0f, w0), aob.p1(4.0f, w0));
                    xi5Var.w.x.setStrokeWidth(hl.N(1.25f));
                    m66Var.b(xi5Var.w, cwVar);
                }
                View view = xi5Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                zu1 zu1Var = ((ju1) obj3).a;
                zu1Var.lc = ((r47) obj2).e1();
                zu1Var.mc = 0;
                zu1Var.nc = null;
                ((wb2) obj).invalidate();
                break;
        }
    }

    public wt(xi5 xi5Var, cw cwVar, q66 q66Var) {
        this.e = xi5Var;
        this.f = cwVar;
        this.g = q66Var;
    }
}
