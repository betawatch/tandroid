package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
