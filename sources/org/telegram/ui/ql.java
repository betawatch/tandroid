package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
