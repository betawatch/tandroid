package tg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pw0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements d5, pw0, vg.f, vg.k {
    public final /* synthetic */ a0 a;

    public /* synthetic */ u(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        a0 a0Var = this.a;
        a0Var.m0 = i10 * 1000;
        a0Var.Z(false, true);
    }

    @Override // org.telegram.ui.Components.pw0
    public void j(int i10) {
        a0 a0Var = this.a;
        int i11 = a0Var.h0;
        int i12 = vg.d.s;
        if (i11 == 2) {
            a0Var.n0 = i10;
        } else {
            a0Var.o0 = i10;
        }
        a0Var.q0.a.b(a0Var.T(), true);
        if (a0Var.h0 == 3) {
            a0Var.Z(true, true);
        } else {
            a0Var.Z(false, false);
        }
        ug.b bVar = a0Var.g0;
        int T = a0Var.T();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof vg.x) {
                p6 p6Var = ((vg.x) childAt).r;
                String formatPluralString = T <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", T, Integer.valueOf(T));
                p6Var.a();
                p6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof vg.g) {
                vg.g gVar = (vg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.v);
                if (gVar.w) {
                    gVar.setSubtitle(F >= 1 ? LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", F, new Object[0]) : LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    gVar.setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", T, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.pw0
    public /* synthetic */ void l() {
    }
}
