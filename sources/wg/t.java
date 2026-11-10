package wg;

import android.view.View;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.vt0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements s4, vt0, yg.f, yg.k {
    public final /* synthetic */ z a;

    public /* synthetic */ t(z zVar) {
        this.a = zVar;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        z zVar = this.a;
        zVar.h2 = i7 * 1000;
        zVar.k1(false, true);
    }

    @Override // org.telegram.ui.Components.vt0
    public void m(int i7) {
        z zVar = this.a;
        int i10 = zVar.c2;
        int i11 = yg.d.w;
        if (i10 == 2) {
            zVar.i2 = i7;
        } else {
            zVar.j2 = i7;
        }
        zVar.l2.a.c(zVar.f1(), true);
        if (zVar.c2 == 3) {
            zVar.k1(true, true);
        } else {
            zVar.k1(false, false);
        }
        xg.c cVar = zVar.b2;
        int f12 = zVar.f1();
        for (int i12 = 0; i12 < cVar.f.getChildCount(); i12++) {
            View childAt = cVar.f.getChildAt(i12);
            if (childAt instanceof yg.x) {
                i6 i6Var = ((yg.x) childAt).r;
                String G = f12 <= 0 ? "" : id.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                i6Var.a();
                i6Var.c(G, true, true);
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

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void n() {
    }
}
