package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wi0 extends ig.k {
    public boolean F;
    public final /* synthetic */ zi0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(zi0 zi0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = zi0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        zi0 zi0Var = this.G;
        zi0Var.h0 = dp;
        zi0Var.g0.G();
        if (this.F != zi0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = zi0Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.jl0 jl0Var = zi0Var.d;
                uh.n nVar = new uh.n(zi0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                jl0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
