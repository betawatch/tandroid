package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w11 extends c31 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ x11 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w11(x11 x11Var, Context context, Runnable runnable, View view, q21 q21Var, org.telegram.ui.ActionBar.p6 p6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(x11Var.e, context, runnable, view, q21Var, p6Var);
        this.S = x11Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.c31, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
