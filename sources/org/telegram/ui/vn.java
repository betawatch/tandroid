package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
