package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yl extends ci.f4 {
    public final /* synthetic */ bo L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(bo boVar, Activity activity) {
        super(activity, 3);
        this.L0 = boVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.C1);
    }
}
