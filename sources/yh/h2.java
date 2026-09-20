package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.x81;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class h2 extends x81 {
    public final /* synthetic */ y3 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(y3 y3Var, Context context) {
        super(context, null);
        this.U = y3Var;
    }

    @Override // org.telegram.ui.Components.x81
    public final void F(View view, float f7) {
        int i10;
        View view2;
        xh.n2 n2Var;
        xh.n2 n2Var2;
        j2 j2Var;
        j2 j2Var2;
        j2 j2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        y3 y3Var = this.U;
        i10 = ((org.telegram.ui.ActionBar.f3) y3Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                n2Var = y3Var.b0;
                if (n2Var != null && view2 == n2Var.Y && (j2Var3 = n2Var.d0) != null) {
                    j2Var3.invalidate();
                }
                if (view2 == y3Var.Y && (j2Var2 = y3Var.d0) != null) {
                    j2Var2.invalidate();
                }
                n2Var2 = y3Var.c0;
                if (n2Var2 == null && view2 == n2Var2.Y && (j2Var = n2Var2.d0) != null) {
                    j2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        n2Var = y3Var.b0;
        if (n2Var != null) {
            j2Var3.invalidate();
        }
        if (view2 == y3Var.Y) {
            j2Var2.invalidate();
        }
        n2Var2 = y3Var.c0;
        if (n2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.x81
    public final void G() {
        super.G();
        int i10 = this.b;
        y3 y3Var = this.U;
        if (i10 != y3Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new ds0(15, this, this.b > y3Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.U.Y0;
        return dVar == null || dVar.c(0);
    }
}
