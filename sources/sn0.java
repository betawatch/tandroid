// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sn0 implements gj, eja, r72, b34 {
    public final /* synthetic */ ao0 a;

    public /* synthetic */ sn0(ao0 ao0Var) {
        this.a = ao0Var;
    }

    @Override // eja
    public final void k(int i) {
        ao0 ao0Var = this.a;
        int i2 = ao0Var.c2;
        int i3 = pn0.w;
        if (i2 == 2) {
            ao0Var.i2 = i;
        } else {
            ao0Var.j2 = i;
        }
        ao0Var.l2.a.c(ao0Var.a1(), true);
        if (ao0Var.c2 == 3) {
            ao0Var.f1(true, true);
        } else {
            ao0Var.f1(false, false);
        }
        km0 km0Var = ao0Var.b2;
        int a1 = ao0Var.a1();
        for (int i4 = 0; i4 < km0Var.f.getChildCount(); i4++) {
            View childAt = km0Var.f.getChildAt(i4);
            if (childAt instanceof wab) {
                hn hnVar = ((wab) childAt).r;
                String G = a1 <= 0 ? "" : k96.G(a1, "BoostingBoostsCountTitle", Integer.valueOf(a1));
                hnVar.a();
                hnVar.c(G, true, true);
            }
            if (childAt instanceof s72) {
                s72 s72Var = (s72) childAt;
                int F = km0Var.F(s72Var.getChat());
                boolean V = hc2.V(s72Var.x);
                if (s72Var.y) {
                    s72Var.setSubtitle(F >= 1 ? k96.G(F, V ? "Subscribers" : "Members", new Object[0]) : k96.M0(V ? 2131751378 : 2131754876, null));
                } else {
                    s72Var.setSubtitle(k96.G(a1, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        km0Var.g(8);
        km0Var.l(km0Var.e.size() - 12, 12);
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        ao0 ao0Var = this.a;
        ao0Var.h2 = i * 1000;
        ao0Var.f1(false, true);
    }

    @Override // eja
    public final void n() {
    }
}
