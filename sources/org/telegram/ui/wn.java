package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wn extends org.telegram.ui.ActionBar.l5 {
    public boolean J0;
    public final /* synthetic */ xn K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(xn xnVar, Activity activity) {
        super(activity);
        this.K0 = xnVar;
        this.J0 = true;
    }

    @Override // org.telegram.ui.ActionBar.l5
    public final void d(int i10) {
        super.d(i10);
        if (this.J0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            xn xnVar = this.K0;
            xnVar.D2 = dp;
            NumberTextView numberTextView = xnVar.C2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
