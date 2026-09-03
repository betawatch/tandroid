package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vl extends qh.e3 {
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
