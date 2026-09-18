package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qj0 extends xg.i {
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
                org.telegram.ui.Components.ml0 ml0Var = tj0Var.d;
                ji.o oVar = new ji.o(tj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                ml0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
