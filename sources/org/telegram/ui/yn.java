package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yn extends org.telegram.ui.ActionBar.k5 {
    public boolean J0;
    public final /* synthetic */ zn K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(zn znVar, Activity activity) {
        super(activity);
        this.K0 = znVar;
        this.J0 = true;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void d(int i10) {
        super.d(i10);
        if (this.J0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            zn znVar = this.K0;
            znVar.D2 = dp;
            NumberTextView numberTextView = znVar.C2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
