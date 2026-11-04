package xg;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.tt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements r4, tt0, zg.f, zg.k {
    public final /* synthetic */ a0 a;

    public /* synthetic */ u(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        a0 a0Var = this.a;
        a0Var.f2 = i3 * 1000;
        a0Var.k1(false, true);
    }

    @Override // org.telegram.ui.Components.tt0
    public void l(int i3) {
        a0 a0Var = this.a;
        int i10 = a0Var.a2;
        int i11 = zg.d.w;
        if (i10 == 2) {
            a0Var.g2 = i3;
        } else {
            a0Var.h2 = i3;
        }
        a0Var.j2.a.c(a0Var.f1(), true);
        if (a0Var.a2 == 3) {
            a0Var.k1(true, true);
        } else {
            a0Var.k1(false, false);
        }
        yg.b bVar = a0Var.Z1;
        int f12 = a0Var.f1();
        for (int i12 = 0; i12 < bVar.f.getChildCount(); i12++) {
            View childAt = bVar.f.getChildAt(i12);
            if (childAt instanceof zg.x) {
                h6 h6Var = ((zg.x) childAt).r;
                String G = f12 <= 0 ? "" : bd.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                h6Var.a();
                h6Var.c(G, true, true);
            }
            if (childAt instanceof zg.g) {
                zg.g gVar = (zg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean V = t3.V(gVar.x);
                if (gVar.y) {
                    gVar.setSubtitle(F >= 1 ? bd.G(F, V ? "Subscribers" : "Members", new Object[0]) : bd.M0(V ? 2131751391 : 2131754876, null));
                } else {
                    gVar.setSubtitle(bd.G(f12, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.tt0
    public /* synthetic */ void p() {
    }
}
