package wg;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.vt0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements r4, vt0, yg.f, yg.k {
    public final /* synthetic */ y a;

    public /* synthetic */ s(y yVar) {
        this.a = yVar;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        y yVar = this.a;
        yVar.i2 = i7 * 1000;
        yVar.k1(false, true);
    }

    @Override // org.telegram.ui.Components.vt0
    public void l(int i7) {
        y yVar = this.a;
        int i10 = yVar.d2;
        int i11 = yg.d.w;
        if (i10 == 2) {
            yVar.j2 = i7;
        } else {
            yVar.k2 = i7;
        }
        yVar.m2.a.c(yVar.f1(), true);
        if (yVar.d2 == 3) {
            yVar.k1(true, true);
        } else {
            yVar.k1(false, false);
        }
        xg.b bVar = yVar.c2;
        int f12 = yVar.f1();
        for (int i12 = 0; i12 < bVar.f.getChildCount(); i12++) {
            View childAt = bVar.f.getChildAt(i12);
            if (childAt instanceof yg.x) {
                h6 h6Var = ((yg.x) childAt).r;
                String G = f12 <= 0 ? "" : hd.G(f12, "BoostingBoostsCountTitle", Integer.valueOf(f12));
                h6Var.a();
                h6Var.c(G, true, true);
            }
            if (childAt instanceof yg.g) {
                yg.g gVar = (yg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean V = t3.V(gVar.x);
                if (gVar.y) {
                    gVar.setSubtitle(F >= 1 ? hd.G(F, V ? "Subscribers" : "Members", new Object[0]) : hd.M0(V ? 2131751390 : 2131754876, null));
                } else {
                    gVar.setSubtitle(hd.G(f12, V ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", new Object[0]));
                }
            }
        }
        bVar.g(8);
        bVar.k(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void p() {
    }
}
