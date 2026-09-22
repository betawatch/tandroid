package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w51 extends d71 {
    public final /* synthetic */ View Q;
    public final /* synthetic */ TL_stars.TL_starGiftUnique R;
    public final /* synthetic */ x51 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w51(x51 x51Var, Context context, Runnable runnable, View view, q61 q61Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(x51Var.e, context, runnable, view, q61Var, e6Var);
        this.S = x51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override // org.telegram.ui.d71, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
