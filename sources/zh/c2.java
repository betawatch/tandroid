package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class c2 extends l91 {
    public final /* synthetic */ r3 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(r3 r3Var, Context context) {
        super(context, null);
        this.T = r3Var;
    }

    @Override // org.telegram.ui.Components.l91
    public final void E(View view, float f7) {
        int i10;
        View view2;
        yh.l2 l2Var;
        yh.l2 l2Var2;
        e2 e2Var;
        e2 e2Var2;
        e2 e2Var3;
        if (getMeasuredWidth() <= 0) {
            view.setTranslationX(f7);
            return;
        }
        float clamp = Utilities.clamp(f7 / getMeasuredWidth(), 1.0f, -1.0f);
        r3 r3Var = this.T;
        i10 = ((org.telegram.ui.ActionBar.e3) r3Var).backgroundPaddingLeft;
        view.setTranslationX(((-clamp) * 2.0f * i10) + f7);
        view.setPivotX(clamp <= 0.0f ? view.getMeasuredWidth() : 0.0f);
        view.setCameraDistance(view.getMeasuredHeight() * 3.4f);
        view.setScaleX(1.0f - Math.abs(0.25f * clamp));
        view.setRotationY(clamp * 10.0f);
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout.getChildCount() > 0) {
                view2 = frameLayout.getChildAt(0);
                l2Var = r3Var.c0;
                if (l2Var != null && view2 == l2Var.Y && (e2Var3 = l2Var.e0) != null) {
                    e2Var3.invalidate();
                }
                if (view2 == r3Var.Y && (e2Var2 = r3Var.e0) != null) {
                    e2Var2.invalidate();
                }
                l2Var2 = r3Var.d0;
                if (l2Var2 == null && view2 == l2Var2.Y && (e2Var = l2Var2.e0) != null) {
                    e2Var.invalidate();
                    return;
                }
                return;
            }
        }
        view2 = null;
        l2Var = r3Var.c0;
        if (l2Var != null) {
            e2Var3.invalidate();
        }
        if (view2 == r3Var.Y) {
            e2Var2.invalidate();
        }
        l2Var2 = r3Var.d0;
        if (l2Var2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // org.telegram.ui.Components.l91
    public final void F() {
        super.F();
        int i10 = this.b;
        r3 r3Var = this.T;
        if (i10 != r3Var.M1(false)) {
            AndroidUtilities.runOnUIThread(new zr0(20, this, this.b > r3Var.M1(false)));
        }
    }

    @Override // org.telegram.ui.Components.l91
    public final boolean i(MotionEvent motionEvent) {
        f4.d dVar = this.T.Z0;
        return dVar == null || dVar.c(0);
    }
}
