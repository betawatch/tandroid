package wg;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.z4;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements z4, fu0, yg.f, yg.k {
    public final /* synthetic */ z a;

    public /* synthetic */ t(z zVar) {
        this.a = zVar;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        z zVar = this.a;
        zVar.i2 = i7 * 1000;
        zVar.l1(false, true);
    }

    @Override // org.telegram.ui.Components.fu0
    public void n(int i7) {
        z zVar = this.a;
        int i10 = zVar.d2;
        int i11 = yg.d.w;
        if (i10 == 2) {
            zVar.j2 = i7;
        } else {
            zVar.k2 = i7;
        }
        zVar.m2.a.c(zVar.g1(), true);
        if (zVar.d2 == 3) {
            zVar.l1(true, true);
        } else {
            zVar.l1(false, false);
        }
        xg.b bVar = zVar.c2;
        int g12 = zVar.g1();
        for (int i12 = 0; i12 < bVar.f.getChildCount(); i12++) {
            View childAt = bVar.f.getChildAt(i12);
            if (childAt instanceof yg.x) {
                n6 n6Var = ((yg.x) childAt).r;
                String G = g12 <= 0 ? "" : gd.G(g12, "BoostingBoostsCountTitle", Integer.valueOf(g12));
                n6Var.a();
                n6Var.c(G, true, true);
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

    @Override // org.telegram.ui.Components.fu0
    public /* synthetic */ void o() {
    }
}
