package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tj0 extends yg.i {
    public boolean J;
    public final /* synthetic */ wj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj0(wj0 wj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = wj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        wj0 wj0Var = this.K;
        wj0Var.l0 = dp;
        wj0Var.k0.G();
        if (this.J != wj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = wj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.mm0 mm0Var = wj0Var.d;
                ki.o oVar = new ki.o(wj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
