package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class i1 extends yg.i {
    public boolean J;
    public final /* synthetic */ n1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(n1 n1Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.K = n1Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        n1 n1Var = this.K;
        n1Var.q0 = dp;
        n1Var.p0.G();
        if (this.J != n1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = n1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                ll0 ll0Var = n1Var.d;
                ki.p pVar = new ki.p(n1Var.getContext(), 2, 0.6f);
                pVar.a = 1;
                pVar.p = AndroidUtilities.dp(36.0f);
                ll0Var.getLayoutManager().w0(pVar);
            }
        }
    }
}
