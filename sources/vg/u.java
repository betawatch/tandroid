package vg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements e5, zw0, xg.f, xg.k {
    public final /* synthetic */ a0 a;

    public /* synthetic */ u(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        a0 a0Var = this.a;
        a0Var.m0 = i10 * 1000;
        a0Var.a0(false, true);
    }

    @Override // org.telegram.ui.Components.zw0
    public void j(int i10) {
        a0 a0Var = this.a;
        int i11 = a0Var.h0;
        int i12 = xg.d.v;
        if (i11 == 2) {
            a0Var.n0 = i10;
        } else {
            a0Var.o0 = i10;
        }
        a0Var.q0.a.b(a0Var.V(), true);
        if (a0Var.h0 == 3) {
            a0Var.a0(true, true);
        } else {
            a0Var.a0(false, false);
        }
        wg.b bVar = a0Var.g0;
        int V = a0Var.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof xg.x) {
                s6 s6Var = ((xg.x) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                s6Var.a();
                s6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof xg.g) {
                xg.g gVar = (xg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.w);
                if (gVar.x) {
                    gVar.setSubtitle(F >= 1 ? LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", F, new Object[0]) : LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    gVar.setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", V, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.zw0
    public /* synthetic */ void m() {
    }
}
