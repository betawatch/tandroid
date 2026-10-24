package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.ActionBar.n5 {
    public boolean M0;
    public final /* synthetic */ sn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(sn snVar, Activity activity) {
        super(activity);
        this.N0 = snVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.n5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            sn snVar = this.N0;
            snVar.S2 = dp;
            NumberTextView numberTextView = snVar.R2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
