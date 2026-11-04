package vg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ri0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ri0 ri0Var = (ri0) this.b;
                Drawable drawable = (Drawable) this.c;
                ri0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((h1) ri0Var.c).t2;
                if (!(view instanceof org.telegram.ui.Cells.q1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.q1) view).p2();
                    break;
                }
            default:
                ug.q1 q1Var = (ug.q1) this.b;
                boolean[] zArr = (boolean[]) this.c;
                q1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        q1Var.s0.b(q1Var.z0, false);
                    }
                    float f10 = (floatValue - 0.5f) / 0.5f;
                    q1Var.setRotationY((1.0f - f10) * (-90.0f));
                    q1Var.A0 = (f10 * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    break;
                } else {
                    float f11 = floatValue / 0.5f;
                    q1Var.setRotationY(90.0f * f11);
                    q1Var.A0 = ((1.0f - f11) * 0.3f) + 0.7f;
                    q1Var.invalidate();
                    break;
                }
        }
    }
}
