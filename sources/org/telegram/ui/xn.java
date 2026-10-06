package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class xn extends org.telegram.ui.ActionBar.i5 {
    public boolean M0;
    public final /* synthetic */ yn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(yn ynVar, Activity activity) {
        super(activity);
        this.N0 = ynVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            yn ynVar = this.N0;
            ynVar.E2 = dp;
            NumberTextView numberTextView = ynVar.D2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
