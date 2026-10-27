package tg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ml0;
import sg.b2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
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
                ml0 ml0Var = (ml0) this.b;
                Drawable drawable = (Drawable) this.c;
                ml0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ml0Var.c).A0;
                if (!(view instanceof org.telegram.ui.Cells.s1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.s1) view).a3();
                    break;
                }
            default:
                b2 b2Var = (b2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                b2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        b2Var.r0.b(b2Var.y0, false);
                    }
                    float f7 = (floatValue - 0.5f) / 0.5f;
                    b2Var.setRotationY((1.0f - f7) * (-90.0f));
                    b2Var.z0 = (f7 * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    break;
                } else {
                    float f10 = floatValue / 0.5f;
                    b2Var.setRotationY(90.0f * f10);
                    b2Var.z0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                    break;
                }
        }
    }
}
