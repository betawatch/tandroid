package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zi0 extends yg.h {
    public boolean J;
    public final /* synthetic */ cj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = cj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        cj0 cj0Var = this.K;
        cj0Var.l0 = dp;
        cj0Var.k0.G();
        if (this.J != cj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = cj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.im0 im0Var = cj0Var.d;
                li.n nVar = new li.n(cj0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                im0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
