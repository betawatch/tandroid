package sg;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.o6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements c5, dw0, ug.f, ug.k {
    public final /* synthetic */ a0 a;

    public /* synthetic */ u(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        a0 a0Var = this.a;
        a0Var.m0 = i10 * 1000;
        a0Var.a0(false, true);
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        a0 a0Var = this.a;
        int i11 = a0Var.h0;
        int i12 = ug.d.s;
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
        tg.b bVar = a0Var.g0;
        int V = a0Var.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof ug.x) {
                o6 o6Var = ((ug.x) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
                o6Var.a();
                o6Var.c(formatPluralString, true, true);
            }
            if (childAt instanceof ug.g) {
                ug.g gVar = (ug.g) childAt;
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

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
    }
}
