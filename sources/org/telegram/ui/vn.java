package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vn extends org.telegram.ui.ActionBar.h5 {
    public boolean M0;
    public final /* synthetic */ wn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(wn wnVar, Activity activity) {
        super(activity);
        this.N0 = wnVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            wn wnVar = this.N0;
            wnVar.G2 = dp;
            NumberTextView numberTextView = wnVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
