package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x51 extends e71 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ y51 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x51(y51 y51Var, Context context, Runnable runnable, View view, r61 r61Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(y51Var.e, context, runnable, view, r61Var, f6Var);
        this.S = y51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.e71, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
