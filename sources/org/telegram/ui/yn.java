package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class yn extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final /* synthetic */ zn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(zn znVar, Activity activity) {
        super(activity);
        this.N0 = znVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            zn znVar = this.N0;
            znVar.G2 = dp;
            NumberTextView numberTextView = znVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
