package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ql extends ei.x3 {
    public final /* synthetic */ sn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(sn snVar, Activity activity) {
        super(activity, 3);
        this.L0 = snVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.O1);
    }
}
