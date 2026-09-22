package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.sr0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class i2 extends i81 {
    public final /* synthetic */ z3 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(z3 z3Var, Context context) {
        super(context, null);
        this.T = z3Var;
    }

    @Override // org.telegram.ui.Components.i81
    public final void E(View view, float f7) {
        int i10;
        View view2;
        xh.m2 m2Var;
        xh.m2 m2Var2;
        k2 k2Var;
        k2 k2Var2;
        k2 k2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        z3 z3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) z3Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                m2Var = z3Var.b0;
                if (m2Var != null && view2 == m2Var.Y && (k2Var3 = m2Var.d0) != null) {
                    k2Var3.invalidate();
                }
                if (view2 == z3Var.Y && (k2Var2 = z3Var.d0) != null) {
                    k2Var2.invalidate();
                }
                m2Var2 = z3Var.c0;
                if (m2Var2 == null && view2 == m2Var2.Y && (k2Var = m2Var2.d0) != null) {
                    k2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        m2Var = z3Var.b0;
        if (m2Var != null) {
            k2Var3.invalidate();
        }
        if (view2 == z3Var.Y) {
            k2Var2.invalidate();
        }
        m2Var2 = z3Var.c0;
        if (m2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.i81
    public final void F() {
        super.F();
        int i10 = this.b;
        z3 z3Var = this.T;
        if (i10 != z3Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new sr0(15, this, this.b > z3Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.T.Y0;
        return dVar == null || dVar.c(0);
    }
}
