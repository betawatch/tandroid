package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vn extends org.telegram.ui.ActionBar.b6 {
    public boolean M0;
    public final /* synthetic */ wn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(wn wnVar, Activity activity) {
        super(activity);
        this.N0 = wnVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            wn wnVar = this.N0;
            wnVar.S2 = dp;
            NumberTextView numberTextView = wnVar.R2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
