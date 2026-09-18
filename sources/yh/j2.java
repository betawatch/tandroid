package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.tr0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class j2 extends j81 {
    public final /* synthetic */ a4 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(a4 a4Var, Context context) {
        super(context, null);
        this.U = a4Var;
    }

    @Override // org.telegram.ui.Components.j81
    public final void F(View view, float f7) {
        int i10;
        View view2;
        xh.m2 m2Var;
        xh.m2 m2Var2;
        l2 l2Var;
        l2 l2Var2;
        l2 l2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        a4 a4Var = this.U;
        i10 = ((org.telegram.ui.ActionBar.g3) a4Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                m2Var = a4Var.b0;
                if (m2Var != null && view2 == m2Var.Y && (l2Var3 = m2Var.d0) != null) {
                    l2Var3.invalidate();
                }
                if (view2 == a4Var.Y && (l2Var2 = a4Var.d0) != null) {
                    l2Var2.invalidate();
                }
                m2Var2 = a4Var.c0;
                if (m2Var2 == null && view2 == m2Var2.Y && (l2Var = m2Var2.d0) != null) {
                    l2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        m2Var = a4Var.b0;
        if (m2Var != null) {
            l2Var3.invalidate();
        }
        if (view2 == a4Var.Y) {
            l2Var2.invalidate();
        }
        m2Var2 = a4Var.c0;
        if (m2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.j81
    public final void G() {
        super.G();
        int i10 = this.b;
        a4 a4Var = this.U;
        if (i10 != a4Var.L1(false)) {
            AndroidUtilities.runOnUIThread(new tr0(15, this, this.b > a4Var.L1(false)));
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.U.Y0;
        return dVar == null || dVar.c(0);
    }
}
