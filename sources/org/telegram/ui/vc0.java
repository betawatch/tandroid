package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vc0 extends tf.i0 {
    public final /* synthetic */ cd0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc0(cd0 cd0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, false, z4);
        this.K = cd0Var;
    }

    @Override // f2.o0
    public final void l() {
        cd0 cd0Var = this.K;
        org.telegram.ui.ActionBar.w0 w0Var = cd0Var.w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(cd0Var.T.G);
        }
        TextView textView = cd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, cd0Var.T.x)));
        }
        super.l();
    }
}
