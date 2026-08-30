package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vl extends ph.f3 {
    public final /* synthetic */ xn I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(xn xnVar, Activity activity) {
        super(activity, 3);
        this.I0 = xnVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.I0.z1);
    }
}
