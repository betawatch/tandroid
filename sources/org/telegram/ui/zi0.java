package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zi0 extends gg.l {
    public boolean F;
    public final /* synthetic */ dj0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = dj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        dj0 dj0Var = this.G;
        dj0Var.h0 = dp;
        dj0Var.g0.G();
        if (this.F != dj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = dj0Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.zk0 zk0Var = dj0Var.d;
                sh.n nVar = new sh.n(dj0Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                zk0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
