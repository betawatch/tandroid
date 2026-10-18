package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final /* synthetic */ sn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(sn snVar, Activity activity) {
        super(activity);
        this.N0 = snVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            sn snVar = this.N0;
            snVar.G2 = dp;
            NumberTextView numberTextView = snVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
