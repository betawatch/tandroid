package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
