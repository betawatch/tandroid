package wg;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements a5, gu0, yg.f, yg.k {
    public final /* synthetic */ a0 a;

    public /* synthetic */ u(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        a0 a0Var = this.a;
        a0Var.i2 = i7 * 1000;
        a0Var.l1(false, true);
    }

    @Override // org.telegram.ui.Components.gu0
    public void k(int i7) {
        a0 a0Var = this.a;
        int i10 = a0Var.d2;
        int i11 = yg.d.w;
        if (i10 == 2) {
            a0Var.j2 = i7;
        } else {
            a0Var.k2 = i7;
        }
        a0Var.m2.a.c(a0Var.g1(), true);
        if (a0Var.d2 == 3) {
            a0Var.l1(true, true);
        } else {
            a0Var.l1(false, false);
        }
        xg.b bVar = a0Var.c2;
        int g12 = a0Var.g1();
        for (int i12 = 0; i12 < bVar.f.getChildCount(); i12++) {
            View childAt = bVar.f.getChildAt(i12);
            if (childAt instanceof yg.x) {
                o6 o6Var = ((yg.x) childAt).r;
                String G = g12 <= 0 ? "" : gd.G(g12, "BoostingBoostsCountTitle", Integer.valueOf(g12));
                o6Var.a();
                o6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean V = v3.V(gVar.x);
                if (gVar.y) {
                    gVar.setSubtitle(F >= 1 ? gd.G(F, V ? "Subscribers" : "Members", new Object[0]) : gd.N0(V ? 2131751378 : 2131754876, null));
                } else {
                    gVar.setSubtitle(gd.G(g12, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.gu0
    public /* synthetic */ void o() {
    }
}
