package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y21 extends x61 {
    public final /* synthetic */ a31 a2;
    public final /* synthetic */ n61[] b2;
    public final /* synthetic */ b31 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y21(b31 b31Var, b31 b31Var2, Activity activity, Integer num, a31 a31Var, n61[] n61VarArr) {
        super(b31Var2, activity, false, num, 2, null);
        this.c2 = b31Var;
        this.a2 = a31Var;
        this.b2 = n61VarArr;
    }

    @Override // org.telegram.ui.x61
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 == null) {
            return;
        }
        b31 b31Var = this.c2;
        i10 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l10);
        a31 a31Var = this.a2;
        if (a31Var != null) {
            a31Var.a(true);
        }
        n61 n61Var = this.b2[0];
        if (n61Var != null) {
            b31Var.n = null;
            n61Var.dismiss();
        }
    }

    @Override // org.telegram.ui.x61
    public final void r(f61 f61Var, mg.q0 q0Var) {
        int i10;
        b31 b31Var = this.c2;
        i10 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f);
        a31 a31Var = this.a2;
        if (a31Var != null) {
            a31Var.a(true);
        }
        n61 n61Var = this.b2[0];
        if (n61Var != null) {
            b31Var.n = null;
            n61Var.dismiss();
        }
    }
}
