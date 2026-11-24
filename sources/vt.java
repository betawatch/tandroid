// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vt extends c01 {
    public final /* synthetic */ byte d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public vt(wt1 wt1Var, k27 k27Var, gb2 gb2Var) {
        this.g = wt1Var;
        this.e = k27Var;
        this.f = gb2Var;
    }

    @Override // c01
    public final void b() {
        switch (this.d) {
            case 0:
                vg5 vg5Var = (vg5) this.e;
                vg5Var.c.m(vg5Var.w, true);
                View view = vg5Var.s;
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

    @Override // c01
    public final void c(boolean z) {
        switch (this.d) {
            case 1:
                if (!z) {
                    gl.d3(new ho1(((wt1) this.g).a, (byte) 12), 250L);
                    break;
                }
                break;
            default:
                super.c(z);
                break;
        }
    }

    @Override // c01
    public final void d() {
        byte b = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                m46 m46Var = (m46) obj3;
                vg5 vg5Var = (vg5) obj2;
                vg5Var.getClass();
                i46 i46Var = vg5Var.c;
                bw bwVar = (bw) obj;
                vg5Var.s = bwVar != null ? bwVar.b : null;
                i46Var.m(vg5Var.w, true);
                if (bwVar != null) {
                    vg5Var.w = i46.j(bwVar.d, m46Var.i, 0.0f);
                    int w0 = bkb.w0(null, bkb.Be, false);
                    vg5Var.w.g(bkb.p1(0.8f, w0), bkb.p1(1.3f, w0), bkb.p1(1.0f, w0), bkb.p1(4.0f, w0));
                    vg5Var.w.x.setStrokeWidth(gl.N(1.25f));
                    i46Var.b(vg5Var.w, bwVar);
                }
                View view = vg5Var.s;
                if (view != null) {
                    view.invalidate();
                }
                super.d();
                break;
            default:
                mu1 mu1Var = ((wt1) obj3).a;
                mu1Var.ac = ((k27) obj2).e1();
                mu1Var.bc = 0;
                mu1Var.cc = null;
                ((gb2) obj).invalidate();
                break;
        }
    }

    public vt(vg5 vg5Var, bw bwVar, m46 m46Var) {
        this.e = vg5Var;
        this.f = bwVar;
        this.g = m46Var;
    }
}
