package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wh extends org.telegram.ui.Components.on {
    public final /* synthetic */ wm N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(wm wmVar, Activity activity, int i3, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, i3, document, e6Var);
        this.N = wmVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        float y9 = getY();
        wm wmVar = this.N;
        float y10 = wmVar.g1.getY() + y9;
        this.K = wmVar.m1.getBackgroundSizeY();
        this.J = y10;
    }
}
