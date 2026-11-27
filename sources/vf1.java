// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vf1 extends cxe {
    public r47 a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ wf1 f;

    public vf1(wf1 wf1Var) {
        this.f = wf1Var;
    }

    @Override // cxe
    public final void a() {
        r47 r47Var = this.a;
        wf1 wf1Var = this.f;
        if (r47Var != null) {
            int indexOf = wf1Var.p0.indexOf(r47Var) + wf1Var.F.f;
            if (indexOf >= 0) {
                wf1Var.y.h1(indexOf, this.e, false);
            }
        } else {
            wf1Var.y.h1(this.b, this.d, this.c);
        }
        this.a = null;
        wf1Var.W = true;
        wf1Var.i1();
        hl.c3(new fv0(this, (byte) 25));
    }

    @Override // cxe
    public final void c() {
        wf1 wf1Var = this.f;
        wf1Var.K0 = wf1Var.getNotificationCenter().p(wf1.R0, wf1Var.K0, true);
    }

    @Override // cxe
    public final void d(View view) {
        if (view instanceof wb2) {
            this.f.h.add((wb2) view);
        }
    }
}
