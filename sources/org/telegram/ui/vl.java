package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vl extends ci.e4 {
    public final /* synthetic */ xn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(xn xnVar, Activity activity) {
        super(activity, 3);
        this.L0 = xnVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.C1);
    }
}
