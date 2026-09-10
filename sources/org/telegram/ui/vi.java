package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vi extends org.telegram.ui.Components.oo {
    public final /* synthetic */ eo M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(eo eoVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.M = eoVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        eo eoVar = this.M;
        float y10 = eoVar.R0.getY() + y3;
        this.J = eoVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
