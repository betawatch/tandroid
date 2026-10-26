package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zi0 extends zg.i {
    public boolean K;
    public final /* synthetic */ cj0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.L = cj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        cj0 cj0Var = this.L;
        cj0Var.l0 = dp;
        cj0Var.k0.G();
        if (this.K != cj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = cj0Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.mm0 mm0Var = cj0Var.d;
                mi.n nVar = new mi.n(cj0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
