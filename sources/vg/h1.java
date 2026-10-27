package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h1 extends zg.i {
    public boolean K;
    public final /* synthetic */ n1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(n1 n1Var, Context context, u6 u6Var) {
        super(context, u6Var);
        this.L = n1Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        n1 n1Var = this.L;
        n1Var.q0 = dp;
        n1Var.p0.G();
        if (this.K != n1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = n1Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                nm0 nm0Var = n1Var.d;
                mi.n nVar = new mi.n(n1Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                nm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
