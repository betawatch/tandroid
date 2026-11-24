// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class so0 implements gk, gla, c92, m44 {
    public final /* synthetic */ ap0 a;

    public /* synthetic */ so0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    @Override // gla
    public final void i(int i) {
        ap0 ap0Var = this.a;
        int i2 = ap0Var.c2;
        int i3 = po0.w;
        if (i2 == 2) {
            ap0Var.i2 = i;
        } else {
            ap0Var.j2 = i;
        }
        ap0Var.l2.a.c(ap0Var.a1(), true);
        if (ap0Var.c2 == 3) {
            ap0Var.f1(true, true);
        } else {
            ap0Var.f1(false, false);
        }
        kn0 kn0Var = ap0Var.b2;
        int a1 = ap0Var.a1();
        for (int i4 = 0; i4 < kn0Var.f.getChildCount(); i4++) {
            View childAt = kn0Var.f.getChildAt(i4);
            if (childAt instanceof xcb) {
                io ioVar = ((xcb) childAt).r;
                String G = a1 <= 0 ? "" : jb6.G(a1, "BoostingBoostsCountTitle", Integer.valueOf(a1));
                ioVar.a();
                ioVar.c(G, true, true);
            }
            if (childAt instanceof d92) {
                d92 d92Var = (d92) childAt;
                int F = kn0Var.F(d92Var.getChat());
                boolean V = sd2.V(d92Var.x);
                if (d92Var.y) {
                    d92Var.setSubtitle(F >= 1 ? jb6.G(F, V ? "Subscribers" : "Members", new Object[0]) : jb6.M0(V ? 2131751327 : 2131754876, null));
                } else {
                    d92Var.setSubtitle(jb6.G(a1, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        kn0Var.g(8);
        kn0Var.l(kn0Var.e.size() - 12, 12);
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        ap0 ap0Var = this.a;
        ap0Var.h2 = i * 1000;
        ap0Var.f1(false, true);
    }

    @Override // gla
    public final void m() {
    }
}
