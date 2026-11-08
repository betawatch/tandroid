package wg;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ut0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements t4, ut0, yg.f, yg.k {
    public final /* synthetic */ a0 a;

    public /* synthetic */ u(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        a0 a0Var = this.a;
        a0Var.e2 = i7 * 1000;
        a0Var.k1(false, true);
    }

    @Override // org.telegram.ui.Components.ut0
    public void m(int i7) {
        a0 a0Var = this.a;
        int i10 = a0Var.Z1;
        int i11 = yg.d.w;
        if (i10 == 2) {
            a0Var.f2 = i7;
        } else {
            a0Var.g2 = i7;
        }
        a0Var.i2.a.c(a0Var.f1(), true);
        if (a0Var.Z1 == 3) {
            a0Var.k1(true, true);
        } else {
            a0Var.k1(false, false);
        }
        xg.c cVar = a0Var.Y1;
        int f12 = a0Var.f1();
        for (int i12 = 0; i12 < cVar.f.getChildCount(); i12++) {
            View childAt = cVar.f.getChildAt(i12);
            if (childAt instanceof yg.x) {
                j6 j6Var = ((yg.x) childAt).r;
                String G = f12 <= 0 ? "" : id.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                j6Var.a();
                j6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = cVar.F(gVar.getChat());
                boolean V = t3.V(gVar.x);
                if (gVar.y) {
                    gVar.setSubtitle(F >= 1 ? id.G(F, V ? "Subscribers" : "Members", new Object[0]) : id.M0(V ? 2131751391 : 2131754876, null));
                } else {
                    gVar.setSubtitle(id.G(f12, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        cVar.g(8);
        cVar.k(cVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.ut0
    public /* synthetic */ void n() {
    }
}
