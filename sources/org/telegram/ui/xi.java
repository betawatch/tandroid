package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class xi extends org.telegram.ui.Components.wo {
    public final /* synthetic */ fo M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(fo foVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, i10, document, c6Var);
        this.M = foVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        fo foVar = this.M;
        float y10 = foVar.R0.getY() + y3;
        this.J = foVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
