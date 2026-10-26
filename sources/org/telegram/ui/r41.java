package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r41 extends y51 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ s41 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r41(s41 s41Var, Context context, Runnable runnable, View view, l51 l51Var, org.telegram.ui.ActionBar.u6 u6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(s41Var.e, context, runnable, view, l51Var, u6Var);
        this.S = s41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.y51, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
