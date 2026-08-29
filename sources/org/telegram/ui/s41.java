package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s41 extends z51 {
    public final /* synthetic */ View M;
    public final /* synthetic */ TL_stars.TL_starGiftUnique N;
    public final /* synthetic */ t41 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s41(t41 t41Var, Context context, Runnable runnable, View view, m51 m51Var, org.telegram.ui.ActionBar.c6 c6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(t41Var.e, context, runnable, view, m51Var, c6Var);
        this.O = t41Var;
        this.M = view2;
        this.N = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.z51, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.O.e.T0 = null;
    }
}
