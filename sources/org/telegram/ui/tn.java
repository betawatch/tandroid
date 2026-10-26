package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class tn extends org.telegram.ui.ActionBar.b6 {
    public boolean M0;
    public final /* synthetic */ un N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(un unVar, Activity activity) {
        super(activity);
        this.N0 = unVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            un unVar = this.N0;
            unVar.S2 = dp;
            NumberTextView numberTextView = unVar.R2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
