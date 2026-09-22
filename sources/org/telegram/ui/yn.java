package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yn extends org.telegram.ui.ActionBar.j5 {
    public boolean M0;
    public final /* synthetic */ zn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(zn znVar, Activity activity) {
        super(activity);
        this.N0 = znVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i10) {
        super.d(i10);
        if (this.M0 && getVisibility() == 0) {
            int dp = AndroidUtilities.dp(4.0f) + getTextWidth();
            zn znVar = this.N0;
            znVar.G2 = dp;
            NumberTextView numberTextView = znVar.F2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(dp);
            }
        }
    }
}
