package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ul extends ci.e4 {
    public final /* synthetic */ wn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(wn wnVar, Activity activity) {
        super(activity, 3);
        this.L0 = wnVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.C1);
    }
}
