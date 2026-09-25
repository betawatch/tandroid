package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.yr0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class g2 extends w81 {
    public final /* synthetic */ x3 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(x3 x3Var, Context context) {
        super(context, null);
        this.T = x3Var;
    }

    @Override // org.telegram.ui.Components.w81
    public final void E(View view, float f7) {
        int i10;
        View view2;
        xh.n2 n2Var;
        xh.n2 n2Var2;
        i2 i2Var;
        i2 i2Var2;
        i2 i2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        x3 x3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.e3) x3Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                n2Var = x3Var.b0;
                if (n2Var != null && view2 == n2Var.Y && (i2Var3 = n2Var.d0) != null) {
                    i2Var3.invalidate();
                }
                if (view2 == x3Var.Y && (i2Var2 = x3Var.d0) != null) {
                    i2Var2.invalidate();
                }
                n2Var2 = x3Var.c0;
                if (n2Var2 == null && view2 == n2Var2.Y && (i2Var = n2Var2.d0) != null) {
                    i2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        n2Var = x3Var.b0;
        if (n2Var != null) {
            i2Var3.invalidate();
        }
        if (view2 == x3Var.Y) {
            i2Var2.invalidate();
        }
        n2Var2 = x3Var.c0;
        if (n2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.w81
    public final void F() {
        super.F();
        int i10 = this.b;
        x3 x3Var = this.T;
        if (i10 != x3Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new yr0(16, this, this.b > x3Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.T.Y0;
        return dVar == null || dVar.c(0);
    }
}
