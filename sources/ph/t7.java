package ph;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t7 extends c8 {
    public final /* synthetic */ z7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(z7 z7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, r7 r7Var) {
        super(context, f6Var, r7Var);
        this.I = z7Var;
    }

    @Override // ph.c8
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        z7 z7Var = this.I;
        z7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (z7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = z7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        z7 z7Var = this.I;
        z7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (z7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = z7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
