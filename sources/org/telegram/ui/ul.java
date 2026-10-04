package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ul extends ci.e4 {
    public final /* synthetic */ yn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(yn ynVar, Activity activity) {
        super(activity, 3);
        this.L0 = ynVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.A1);
    }
}
