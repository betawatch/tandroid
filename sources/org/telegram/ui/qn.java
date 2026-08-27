package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qn extends org.telegram.ui.ActionBar.h5 {
    public boolean I0;
    public final /* synthetic */ rn J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(rn rnVar, Activity activity) {
        super(activity);
        this.J0 = rnVar;
        this.I0 = true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void d(int i10) {
        super.d(i10);
        if (this.I0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            rn rnVar = this.J0;
            rnVar.C2 = dp;
            NumberTextView numberTextView = rnVar.B2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
