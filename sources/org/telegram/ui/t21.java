package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t21 extends r61 {
    public final /* synthetic */ v21 a2;
    public final /* synthetic */ i61[] b2;
    public final /* synthetic */ w21 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(w21 w21Var, w21 w21Var2, Activity activity, Integer num, v21 v21Var, i61[] i61VarArr) {
        super(w21Var2, activity, false, num, 2, null);
        this.c2 = w21Var;
        this.a2 = v21Var;
        this.b2 = i61VarArr;
    }

    @Override // org.telegram.ui.r61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 == null) {
            return;
        }
        w21 w21Var = this.c2;
        i10 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l10);
        v21 v21Var = this.a2;
        if (v21Var != null) {
            v21Var.a(true);
        }
        i61 i61Var = this.b2[0];
        if (i61Var != null) {
            w21Var.n = null;
            i61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.r61
    public final void r(a61 a61Var, ng.q0 q0Var) {
        int i10;
        w21 w21Var = this.c2;
        i10 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f);
        v21 v21Var = this.a2;
        if (v21Var != null) {
            v21Var.a(true);
        }
        i61 i61Var = this.b2[0];
        if (i61Var != null) {
            w21Var.n = null;
            i61Var.dismiss();
        }
    }
}
