package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xl extends ph.f3 {
    public final /* synthetic */ zn I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(zn znVar, Activity activity) {
        super(activity, 3);
        this.I0 = znVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.I0.z1);
    }
}
