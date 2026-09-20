package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class si extends org.telegram.ui.Components.jo {
    public final /* synthetic */ zn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(zn znVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.M = znVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        zn znVar = this.M;
        float y10 = znVar.R0.getY() + y3;
        this.J = znVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
