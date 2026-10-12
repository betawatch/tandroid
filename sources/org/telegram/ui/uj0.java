package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class uj0 extends yg.i {
    public boolean J;
    public final /* synthetic */ xj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(xj0 xj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = xj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        xj0 xj0Var = this.K;
        xj0Var.l0 = dp;
        xj0Var.k0.G();
        if (this.J != xj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = xj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.mm0 mm0Var = xj0Var.d;
                ki.o oVar = new ki.o(xj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
