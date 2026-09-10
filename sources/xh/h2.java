package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.v81;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h2 extends v81 {
    public final /* synthetic */ x3 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(x3 x3Var, Context context) {
        super(context, null);
        this.T = x3Var;
    }

    @Override // org.telegram.ui.Components.v81
    public final void E(View view, float f7) {
        int i10;
        View view2;
        wh.l2 l2Var;
        wh.l2 l2Var2;
        j2 j2Var;
        j2 j2Var2;
        j2 j2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        x3 x3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.h3) x3Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                l2Var = x3Var.b0;
                if (l2Var != null && view2 == l2Var.Y && (j2Var3 = l2Var.d0) != null) {
                    j2Var3.invalidate();
                }
                if (view2 == x3Var.Y && (j2Var2 = x3Var.d0) != null) {
                    j2Var2.invalidate();
                }
                l2Var2 = x3Var.c0;
                if (l2Var2 == null && view2 == l2Var2.Y && (j2Var = l2Var2.d0) != null) {
                    j2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l2Var = x3Var.b0;
        if (l2Var != null) {
            j2Var3.invalidate();
        }
        if (view2 == x3Var.Y) {
            j2Var2.invalidate();
        }
        l2Var2 = x3Var.c0;
        if (l2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.v81
    public final void F() {
        super.F();
        int i10 = this.b;
        x3 x3Var = this.T;
        if (i10 != x3Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new bs0(15, this, this.b > x3Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.T.Y0;
        return dVar == null || dVar.c(0);
    }
}
