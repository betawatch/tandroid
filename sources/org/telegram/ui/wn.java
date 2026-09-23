package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wn extends org.telegram.ui.ActionBar.i5 {
    public boolean M0;
    public final /* synthetic */ xn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(xn xnVar, Activity activity) {
        super(activity);
        this.N0 = xnVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            xn xnVar = this.N0;
            xnVar.G2 = dp;
            NumberTextView numberTextView = xnVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
