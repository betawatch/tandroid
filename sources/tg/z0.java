package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class z0 extends xg.i {
    public final /* synthetic */ a1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.J = a1Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        a1 a1Var = this.J;
        a1Var.p0 = dp;
        a1Var.o0.G();
    }
}
