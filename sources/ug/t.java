package ug;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.q6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements e5, nw0, wg.f, wg.k {
    public final /* synthetic */ z a;

    public /* synthetic */ t(z zVar) {
        this.a = zVar;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        z zVar = this.a;
        zVar.m0 = i10 * 1000;
        zVar.b0(false, true);
    }

    @Override // org.telegram.ui.Components.nw0
    public void h(int i10) {
        z zVar = this.a;
        int i11 = zVar.h0;
        int i12 = wg.d.v;
        if (i11 == 2) {
            zVar.n0 = i10;
        } else {
            zVar.o0 = i10;
        }
        zVar.q0.a.b(zVar.W(), true);
        if (zVar.h0 == 3) {
            zVar.b0(true, true);
        } else {
            zVar.b0(false, false);
        }
        vg.b bVar = zVar.g0;
        int W = zVar.W();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof wg.x) {
                q6 q6Var = ((wg.x) childAt).r;
                String formatPluralString = W <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", W, Integer.valueOf(W));
                q6Var.a();
                q6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof wg.g) {
                wg.g gVar = (wg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.w);
                if (gVar.x) {
                    gVar.setSubtitle(F >= 1 ? LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", F, new Object[0]) : LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    gVar.setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", W, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.nw0
    public /* synthetic */ void m() {
    }
}
