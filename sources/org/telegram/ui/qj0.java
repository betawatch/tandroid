package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class qj0 extends yg.i {
    public boolean J;
    public final /* synthetic */ tj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = tj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        tj0 tj0Var = this.K;
        tj0Var.l0 = dp;
        tj0Var.k0.G();
        if (this.J != tj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = tj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.ll0 ll0Var = tj0Var.d;
                ki.p pVar = new ki.p(tj0Var.getContext(), 2, 0.6f);
                pVar.a = 1;
                pVar.p = AndroidUtilities.dp(36.0f);
                ll0Var.getLayoutManager().w0(pVar);
            }
        }
    }
}
