package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class y0 extends xg.i {
    public final /* synthetic */ z0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.J = z0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        z0 z0Var = this.J;
        z0Var.p0 = dp;
        z0Var.o0.G();
    }
}
