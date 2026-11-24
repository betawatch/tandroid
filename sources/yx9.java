// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yx9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vz9 b;

    public /* synthetic */ yx9(vz9 vz9Var, byte b) {
        this.a = b;
        this.b = vz9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        vz9 vz9Var = this.b;
        switch (b) {
            case 0:
                vz9Var.getClass();
                vz9Var.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                vz9Var.l();
                break;
            case 2:
                View view = vz9Var.u0;
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = cmb.v(cmb.v0(cmb.F8, vz9Var.a1), on2.p(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view2 = vz9Var.n0;
                if (view2 != null) {
                    view2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                o72 o72Var = vz9Var.o0;
                if (o72Var != null) {
                    o72Var.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    break;
                }
                break;
            default:
                qy9 qy9Var = vz9Var.b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vz9Var.setTranslationY((1.0f - floatValue) * gm.L(8.0f));
                View view3 = vz9Var.n0;
                if (view3 != null) {
                    view3.setAlpha(floatValue);
                }
                o72 o72Var2 = vz9Var.o0;
                if (o72Var2 != null) {
                    o72Var2.setAlpha(floatValue * floatValue);
                }
                qy9Var.setAlpha(floatValue);
                qy9Var.invalidate();
                vz9Var.invalidate();
                break;
        }
    }
}
