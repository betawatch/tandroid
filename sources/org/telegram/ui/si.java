package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class si extends org.telegram.ui.Components.io {
    public final /* synthetic */ co M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(co coVar, Activity activity, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, i10, document, f6Var);
        this.M = coVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        co coVar = this.M;
        float y10 = coVar.R0.getY() + y3;
        this.J = coVar.X0.getBackgroundSizeY();
        this.I = y10;
    }
}
