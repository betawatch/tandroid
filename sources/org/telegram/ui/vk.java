package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vk extends gi.l3 {
    public final /* synthetic */ wm X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(wm wmVar, Activity activity) {
        super(activity, 3);
        this.X0 = wmVar;
    }

    @Override // gi.l3, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        setTranslationY(((-getTop()) - org.telegram.messenger.g0.L(120.0f)) + this.X0.R1);
    }
}
