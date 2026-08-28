package zf;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.su0;
import yf.a2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                su0 su0Var = (su0) this.b;
                Drawable drawable = (Drawable) this.c;
                su0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((k1) su0Var.c).w0;
                if (!(view instanceof org.telegram.ui.Cells.t1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.t1) view).a3();
                    break;
                }
            default:
                a2 a2Var = (a2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                a2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        a2Var.n0.b(a2Var.u0, false);
                    }
                    float f10 = (floatValue - 0.5f) / 0.5f;
                    a2Var.setRotationY((1.0f - f10) * (-90.0f));
                    a2Var.v0 = (f10 * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    break;
                } else {
                    float f11 = floatValue / 0.5f;
                    a2Var.setRotationY(90.0f * f11);
                    a2Var.v0 = ((1.0f - f11) * 0.3f) + 0.7f;
                    a2Var.invalidate();
                    break;
                }
        }
    }
}
