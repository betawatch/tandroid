package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sn extends org.telegram.ui.ActionBar.h5 {
    public boolean I0;
    public final /* synthetic */ tn J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(tn tnVar, Activity activity) {
        super(activity);
        this.J0 = tnVar;
        this.I0 = true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void d(int i10) {
        super.d(i10);
        if (this.I0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            tn tnVar = this.J0;
            tnVar.C2 = dp;
            NumberTextView numberTextView = tnVar.B2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
