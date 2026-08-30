package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r21 extends q61 {
    public final /* synthetic */ t21 a2;
    public final /* synthetic */ g61[] b2;
    public final /* synthetic */ u21 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(u21 u21Var, u21 u21Var2, Activity activity, Integer num, t21 t21Var, g61[] g61VarArr) {
        super(u21Var2, activity, false, num, 2, null);
        this.c2 = u21Var;
        this.a2 = t21Var;
        this.b2 = g61VarArr;
    }

    @Override // org.telegram.ui.q61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 == null) {
            return;
        }
        u21 u21Var = this.c2;
        i10 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l10);
        t21 t21Var = this.a2;
        if (t21Var != null) {
            t21Var.a(true);
        }
        g61 g61Var = this.b2[0];
        if (g61Var != null) {
            u21Var.n = null;
            g61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.q61
    public final void r(y51 y51Var, mg.q0 q0Var) {
        int i10;
        u21 u21Var = this.c2;
        i10 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f);
        t21 t21Var = this.a2;
        if (t21Var != null) {
            t21Var.a(true);
        }
        g61 g61Var = this.b2[0];
        if (g61Var != null) {
            u21Var.n = null;
            g61Var.dismiss();
        }
    }
}
