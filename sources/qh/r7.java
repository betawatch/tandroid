package qh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class r7 extends a8 {
    public final /* synthetic */ x7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(x7 x7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, p7 p7Var) {
        super(context, g6Var, p7Var);
        this.I = x7Var;
    }

    @Override // qh.a8
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        x7 x7Var = this.I;
        x7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (x7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = x7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        x7 x7Var = this.I;
        x7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (x7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = x7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
