package ph;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s7 extends b8 {
    public final /* synthetic */ y7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(y7 y7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, q7 q7Var) {
        super(context, f6Var, q7Var);
        this.I = y7Var;
    }

    @Override // ph.b8
    public final void setContainerHeight(float f10) {
        super.setContainerHeight(f10);
        y7 y7Var = this.I;
        y7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (y7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = y7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        y7 y7Var = this.I;
        y7Var.y.setTranslationY((Math.min(AndroidUtilities.dp(150.0f), this.F) + (getY() - (y7Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = y7Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
