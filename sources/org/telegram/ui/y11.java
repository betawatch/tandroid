package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class y11 extends z51 {
    public final /* synthetic */ a21 d2;
    public final /* synthetic */ q51[] e2;
    public final /* synthetic */ b21 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y11(b21 b21Var, b21 b21Var2, Activity activity, Integer num, a21 a21Var, q51[] q51VarArr) {
        super(b21Var2, activity, false, num, 2, null);
        this.f2 = b21Var;
        this.d2 = a21Var;
        this.e2 = q51VarArr;
    }

    @Override // org.telegram.ui.z51
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 == null) {
            return;
        }
        b21 b21Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction("animated_" + l4);
        a21 a21Var = this.d2;
        if (a21Var != null) {
            a21Var.a(true);
        }
        q51 q51Var = this.e2[0];
        if (q51Var != null) {
            b21Var.n = null;
            q51Var.dismiss();
        }
    }

    @Override // org.telegram.ui.z51
    public final void r(i51 i51Var, ah.i1 i1Var) {
        int i10;
        b21 b21Var = this.f2;
        i10 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f);
        a21 a21Var = this.d2;
        if (a21Var != null) {
            a21Var.a(true);
        }
        q51 q51Var = this.e2[0];
        if (q51Var != null) {
            b21Var.n = null;
            q51Var.dismiss();
        }
    }
}
