package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wz0 extends c11 {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ xz0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(xz0 xz0Var, Context context, Runnable runnable, View view, q01 q01Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(xz0Var.e, context, runnable, view, q01Var, e6Var);
        this.T = xz0Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.c11, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}
