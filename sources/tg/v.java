package tg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements b5, sv0, vg.f, vg.k {
    public final /* synthetic */ b0 a;

    public /* synthetic */ v(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // org.telegram.ui.Components.b5
    public void J(int i10, int i11, boolean z10) {
        b0 b0Var = this.a;
        b0Var.m0 = i10 * 1000;
        b0Var.a0(false, true);
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        b0 b0Var = this.a;
        int i11 = b0Var.h0;
        int i12 = vg.d.s;
        if (i11 == 2) {
            b0Var.n0 = i10;
        } else {
            b0Var.o0 = i10;
        }
        b0Var.q0.a.b(b0Var.V(), true);
        if (b0Var.h0 == 3) {
            b0Var.a0(true, true);
        } else {
            b0Var.a0(false, false);
        }
        ug.b bVar = b0Var.g0;
        int V = b0Var.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof vg.x) {
                n6 n6Var = ((vg.x) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                n6Var.a();
                n6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof vg.g) {
                vg.g gVar = (vg.g) childAt;
                int F = bVar.F(gVar.getChat());
                boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(gVar.v);
                if (gVar.w) {
                    gVar.setSubtitle(F >= 1 ? LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", F, new Object[0]) : LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    gVar.setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", V, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }
}
