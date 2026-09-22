package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rj0 extends xg.i {
    public boolean J;
    public final /* synthetic */ uj0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(uj0 uj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = uj0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        uj0 uj0Var = this.K;
        uj0Var.l0 = dp;
        uj0Var.k0.G();
        if (this.J != uj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = uj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.yl0 yl0Var = uj0Var.d;
                ji.o oVar = new ji.o(uj0Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                yl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
