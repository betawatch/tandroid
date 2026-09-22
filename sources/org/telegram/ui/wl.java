package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wl extends ci.f4 {
    public final /* synthetic */ zn L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(zn znVar, Activity activity) {
        super(activity, 3);
        this.L0 = znVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.L0.C1);
    }
}
