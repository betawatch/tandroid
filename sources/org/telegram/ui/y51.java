package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class y51 extends f71 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ z51 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(z51 z51Var, Context context, Runnable runnable, View view, s61 s61Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(z51Var.e, context, runnable, view, s61Var, f6Var);
        this.S = z51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.f71, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
