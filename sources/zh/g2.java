package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.mr0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class g2 extends i81 {
    public final /* synthetic */ w3 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(w3 w3Var, Context context) {
        super(context, null);
        this.T = w3Var;
    }

    @Override // org.telegram.ui.Components.i81
    public final void E(View view, float f7) {
        int i10;
        View view2;
        yh.l2 l2Var;
        yh.l2 l2Var2;
        i2 i2Var;
        i2 i2Var2;
        i2 i2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        w3 w3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.f3) w3Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                l2Var = w3Var.b0;
                if (l2Var != null && view2 == l2Var.Y && (i2Var3 = l2Var.d0) != null) {
                    i2Var3.invalidate();
                }
                if (view2 == w3Var.Y && (i2Var2 = w3Var.d0) != null) {
                    i2Var2.invalidate();
                }
                l2Var2 = w3Var.c0;
                if (l2Var2 == null && view2 == l2Var2.Y && (i2Var = l2Var2.d0) != null) {
                    i2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l2Var = w3Var.b0;
        if (l2Var != null) {
            i2Var3.invalidate();
        }
        if (view2 == w3Var.Y) {
            i2Var2.invalidate();
        }
        l2Var2 = w3Var.c0;
        if (l2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.i81
    public final void F() {
        super.F();
        int i10 = this.b;
        w3 w3Var = this.T;
        if (i10 != w3Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new mr0(16, this, this.b > w3Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.T.Y0;
        return dVar == null || dVar.c(0);
    }
}
