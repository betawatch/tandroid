package wg;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.wt0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements t4, wt0, yg.f, yg.k {
    public final /* synthetic */ z a;

    public /* synthetic */ t(z zVar) {
        this.a = zVar;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        z zVar = this.a;
        zVar.e2 = i7 * 1000;
        zVar.k1(false, true);
    }

    @Override // org.telegram.ui.Components.wt0
    public void m(int i7) {
        z zVar = this.a;
        int i10 = zVar.Z1;
        int i11 = yg.d.w;
        if (i10 == 2) {
            zVar.f2 = i7;
        } else {
            zVar.g2 = i7;
        }
        zVar.i2.a.c(zVar.f1(), true);
        if (zVar.Z1 == 3) {
            zVar.k1(true, true);
        } else {
            zVar.k1(false, false);
        }
        xg.c cVar = zVar.Y1;
        int f12 = zVar.f1();
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
                    gVar.setSubtitle(F >= 1 ? id.G(F, V ? "Subscribers" : "Members", new Object[0]) : id.M0(V ? 2131751390 : 2131754876, null));
                } else {
                    gVar.setSubtitle(id.G(f12, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        cVar.g(8);
        cVar.k(cVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.wt0
    public /* synthetic */ void n() {
    }
}
