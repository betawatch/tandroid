package ug;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.rw0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements d5, rw0, wg.f, wg.k {
    public final /* synthetic */ y a;

    public /* synthetic */ s(y yVar) {
        this.a = yVar;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        y yVar = this.a;
        yVar.m0 = i10 * 1000;
        yVar.a0(false, true);
    }

    @Override // org.telegram.ui.Components.rw0
    public void i(int i10) {
        y yVar = this.a;
        int i11 = yVar.h0;
        int i12 = wg.d.v;
        if (i11 == 2) {
            yVar.n0 = i10;
        } else {
            yVar.o0 = i10;
        }
        yVar.q0.a.b(yVar.V(), true);
        if (yVar.h0 == 3) {
            yVar.a0(true, true);
        } else {
            yVar.a0(false, false);
        }
        vg.b bVar = yVar.g0;
        int V = yVar.V();
        for (int i13 = 0; i13 < bVar.f.getChildCount(); i13++) {
            View childAt = bVar.f.getChildAt(i13);
            if (childAt instanceof wg.x) {
                q6 q6Var = ((wg.x) childAt).r;
                String formatPluralString = V <= 0 ? "" : LocaleController.formatPluralString("BoostingBoostsCountTitle", V, Integer.valueOf(V));
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
                    gVar.setSubtitle(LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", V, new Object[0]));
                }
            }
        }
        bVar.m(8);
        bVar.q(bVar.e.size() - 12, 12);
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }
}
