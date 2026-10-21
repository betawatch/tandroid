package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class w11 extends x51 {
    public final /* synthetic */ y11 d2;
    public final /* synthetic */ o51[] e2;
    public final /* synthetic */ z11 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w11(z11 z11Var, z11 z11Var2, Activity activity, Integer num, y11 y11Var, o51[] o51VarArr) {
        super(z11Var2, activity, false, num, 2, null);
        this.f2 = z11Var;
        this.d2 = y11Var;
        this.e2 = o51VarArr;
    }

    @Override // org.telegram.ui.x51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        z11 z11Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        y11 y11Var = this.d2;
        if (y11Var != null) {
            y11Var.a(true);
        }
        o51 o51Var = this.e2[0];
        if (o51Var != null) {
            z11Var.n = null;
            o51Var.dismiss();
        }
    }

    @Override // org.telegram.ui.x51
    public final void r(g51 g51Var, ah.i1 i1Var) {
        int i10;
        z11 z11Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f);
        y11 y11Var = this.d2;
        if (y11Var != null) {
            y11Var.a(true);
        }
        o51 o51Var = this.e2[0];
        if (o51Var != null) {
            z11Var.n = null;
            o51Var.dismiss();
        }
    }
}
