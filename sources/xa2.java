// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xa2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ bb2 c;
    public final /* synthetic */ View d;

    public /* synthetic */ xa2(bb2 bb2Var, View view, float f, byte b) {
        this.a = b;
        this.c = bb2Var;
        this.d = view;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        View view = this.d;
        bb2 bb2Var = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float measuredHeight = bb2Var.G.getMeasuredHeight();
                zu1 zu1Var = bb2Var.F;
                eq0 eq0Var = (eq0) view;
                float measuredHeight2 = ((((measuredHeight - zu1Var.P9) - zu1Var.Ya) / 2.0f) - (eq0Var.getMeasuredHeight() / 2.0f)) + zu1Var.P9;
                eq0Var.setTranslationY(((((float) eq0Var.getTop()) > measuredHeight2 ? measuredHeight2 - eq0Var.getTop() : 0.0f) * floatValue) + ((1.0f - floatValue) * f));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float measuredHeight3 = bb2Var.G.getMeasuredHeight();
                zu1 zu1Var2 = bb2Var.F;
                gbc gbcVar = (gbc) view;
                float measuredHeight4 = ((((measuredHeight3 - zu1Var2.P9) - zu1Var2.Ya) / 2.0f) - (gbcVar.getMeasuredHeight() / 2.0f)) + zu1Var2.P9;
                gbcVar.setTranslationY(((((float) gbcVar.getTop()) > measuredHeight4 ? measuredHeight4 - gbcVar.getTop() : 0.0f) * floatValue2) + ((1.0f - floatValue2) * f));
                break;
        }
    }
}
