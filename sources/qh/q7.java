package qh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class q7 extends z7 {
    public final /* synthetic */ w7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(w7 w7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, o7 o7Var) {
        super(context, g6Var, o7Var);
        this.I = w7Var;
    }

    @Override // qh.z7
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        w7 w7Var = this.I;
        w7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (w7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = w7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        w7 w7Var = this.I;
        w7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (w7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = w7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
