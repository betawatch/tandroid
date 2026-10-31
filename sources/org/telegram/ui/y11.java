package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y11 extends e31 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ z11 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y11(z11 z11Var, Context context, Runnable runnable, View view, s21 s21Var, org.telegram.ui.ActionBar.p6 p6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(z11Var.e, context, runnable, view, s21Var, p6Var);
        this.S = z11Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.e31, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
