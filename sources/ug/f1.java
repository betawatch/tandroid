package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class f1 extends yg.h {
    public boolean K;
    public final /* synthetic */ l1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(l1 l1Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.L = l1Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        l1 l1Var = this.L;
        l1Var.q0 = dp;
        l1Var.p0.G();
        if (this.K != l1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = l1Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                mm0 mm0Var = l1Var.d;
                li.n nVar = new li.n(l1Var.getContext(), 2, 0.6f);
                nVar.a = 1;
                nVar.p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
