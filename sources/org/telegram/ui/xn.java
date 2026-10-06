package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
