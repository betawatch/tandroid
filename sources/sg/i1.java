package sg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ql0;
import zh.i8;
import zh.j8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ql0 ql0Var = (ql0) this.b;
                Drawable drawable = (Drawable) this.c;
                ql0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ql0Var.c).A0;
                if (!(view instanceof org.telegram.ui.Cells.u1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.u1) view).a3();
                    break;
                }
            default:
                j8 j8Var = (j8) this.b;
                i8 i8Var = (i8) this.c;
                j8Var.getClass();
                i8Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j8Var.f1();
                break;
        }
    }
}
