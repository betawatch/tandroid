package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vc0 extends gg.u0 {
    public final /* synthetic */ cd0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(cd0 cd0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = cd0Var;
    }

    @Override // s4.h0
    public final void l() {
        cd0 cd0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = cd0Var.w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(cd0Var.W.J);
        }
        TextView textView = cd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, cd0Var.W.x)));
        }
        super.l();
    }
}
