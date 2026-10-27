package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u41 extends b61 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ v41 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(v41 v41Var, Context context, Runnable runnable, View view, o51 o51Var, org.telegram.ui.ActionBar.u6 u6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(v41Var.e, context, runnable, view, o51Var, u6Var);
        this.S = v41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.b61, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
