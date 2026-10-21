package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class yi0 extends yg.h {
    public boolean J;
    public final /* synthetic */ bj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = bj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        bj0 bj0Var = this.K;
        bj0Var.l0 = dp;
        bj0Var.k0.G();
        if (this.J != bj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = bj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.jm0 jm0Var = bj0Var.d;
                li.n nVar = new li.n(bj0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                jm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
