package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tl extends fi.v3 {
    public final /* synthetic */ wn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(wn wnVar, Activity activity) {
        super(activity, 3);
        this.L0 = wnVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.O1);
    }
}
