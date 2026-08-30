package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tc0 extends tf.i0 {
    public final /* synthetic */ ad0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc0(ad0 ad0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, false, z4);
        this.K = ad0Var;
    }

    @Override // f2.o0
    public final void l() {
        ad0 ad0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = ad0Var.w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(ad0Var.T.G);
        }
        TextView textView = ad0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, ad0Var.T.x)));
        }
        super.l();
    }
}
