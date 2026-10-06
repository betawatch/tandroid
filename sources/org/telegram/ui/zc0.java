package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class zc0 extends gg.u0 {
    public final /* synthetic */ gd0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(gd0 gd0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = gd0Var;
    }

    @Override // s4.h0
    public final void l() {
        gd0 gd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = gd0Var.w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(gd0Var.W.J);
        }
        TextView textView = gd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, gd0Var.W.x)));
        }
        super.l();
    }
}
