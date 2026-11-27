// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sn0 implements hj, yma, i82, x34 {
    public final /* synthetic */ ao0 a;

    public /* synthetic */ sn0(ao0 ao0Var) {
        this.a = ao0Var;
    }

    @Override // yma
    public final void j(int i) {
        ao0 ao0Var = this.a;
        int i2 = ao0Var.c2;
        int i3 = pn0.w;
        if (i2 == 2) {
            ao0Var.i2 = i;
        } else {
            ao0Var.j2 = i;
        }
        ao0Var.l2.a.c(ao0Var.b1(), true);
        if (ao0Var.c2 == 3) {
            ao0Var.g1(true, true);
        } else {
            ao0Var.g1(false, false);
        }
        km0 km0Var = ao0Var.b2;
        int b1 = ao0Var.b1();
        for (int i4 = 0; i4 < km0Var.f.getChildCount(); i4++) {
            View childAt = km0Var.f.getChildAt(i4);
            if (childAt instanceof teb) {
                in inVar = ((teb) childAt).r;
                String G = b1 <= 0 ? "" : ob6.G(b1, "BoostingBoostsCountTitle", Integer.valueOf(b1));
                inVar.a();
                inVar.c(G, true, true);
            }
            if (childAt instanceof j82) {
                j82 j82Var = (j82) childAt;
                int F = km0Var.F(j82Var.getChat());
                boolean V = xc2.V(j82Var.x);
                if (j82Var.y) {
                    j82Var.setSubtitle(F >= 1 ? ob6.G(F, V ? "Subscribers" : "Members", new Object[0]) : ob6.M0(V ? 2131751355 : 2131754872, null));
                } else {
                    j82Var.setSubtitle(ob6.G(b1, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        km0Var.g(8);
        km0Var.l(km0Var.e.size() - 12, 12);
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        ao0 ao0Var = this.a;
        ao0Var.h2 = i * 1000;
        ao0Var.g1(false, true);
    }

    @Override // yma
    public final void m() {
    }
}
