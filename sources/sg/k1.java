package sg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k1 extends wg.h {
    public boolean J;
    public final /* synthetic */ p1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p1 p1Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.K = p1Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        p1 p1Var = this.K;
        p1Var.q0 = dp;
        p1Var.p0.G();
        if (this.J != p1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = p1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                vl0 vl0Var = p1Var.d;
                ii.o oVar = new ii.o(p1Var.getContext(), 2, 0.6f);
                oVar.a = 1;
                oVar.p = AndroidUtilities.dp(36.0f);
                vl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
