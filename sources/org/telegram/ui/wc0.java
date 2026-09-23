package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wc0 extends gg.u0 {
    public final /* synthetic */ dd0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc0(dd0 dd0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = dd0Var;
    }

    @Override // s4.h0
    public final void l() {
        dd0 dd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = dd0Var.w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(dd0Var.W.J);
        }
        TextView textView = dd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, dd0Var.W.x)));
        }
        super.l();
    }
}
