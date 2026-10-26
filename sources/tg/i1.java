package tg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ll0;
import sg.c2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ll0 ll0Var = (ll0) this.b;
                Drawable drawable = (Drawable) this.c;
                ll0Var.getClass();
                drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                View view = ((m1) ll0Var.c).A0;
                if (!(view instanceof org.telegram.ui.Cells.s1)) {
                    view.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.Cells.s1) view).a3();
                    break;
                }
            default:
                c2 c2Var = (c2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                c2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        c2Var.r0.b(c2Var.y0, false);
                    }
                    float f7 = (floatValue - 0.5f) / 0.5f;
                    c2Var.setRotationY((1.0f - f7) * (-90.0f));
                    c2Var.z0 = (f7 * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    break;
                } else {
                    float f10 = floatValue / 0.5f;
                    c2Var.setRotationY(90.0f * f10);
                    c2Var.z0 = ((1.0f - f10) * 0.3f) + 0.7f;
                    c2Var.invalidate();
                    break;
                }
        }
    }
}
