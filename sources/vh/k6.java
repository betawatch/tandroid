package vh;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k6 extends t6 {
    public final /* synthetic */ r6 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(r6 r6Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, i6 i6Var) {
        super(context, p6Var, i6Var);
        this.M = r6Var;
    }

    @Override // vh.t6
    public final void setContainerHeight(float f7) {
        super.setContainerHeight(f7);
        r6 r6Var = this.M;
        r6Var.D.setTranslationY((Math.min(org.telegram.messenger.i0.L(150.0f), this.J) + (getY() - (r6Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = r6Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        r6 r6Var = this.M;
        r6Var.D.setTranslationY((Math.min(org.telegram.messenger.i0.L(150.0f), this.J) + (getY() - (r6Var.e == null ? 0 : r2.getPaddingTop()))) - 1.0f);
        FrameLayout frameLayout = r6Var.e;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
