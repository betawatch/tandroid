package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ri extends org.telegram.ui.Components.jo {
    public final /* synthetic */ zn M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(zn znVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, i10, document, e6Var);
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
