package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uc0 extends uf.i0 {
    public final /* synthetic */ bd0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(bd0 bd0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, false, z4);
        this.K = bd0Var;
    }

    @Override // f2.p0
    public final void l() {
        bd0 bd0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = bd0Var.w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(bd0Var.T.G);
        }
        TextView textView = bd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, bd0Var.T.x)));
        }
        super.l();
    }
}
