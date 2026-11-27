// default package

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class uy7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fz7 b;

    public /* synthetic */ uy7(fz7 fz7Var, byte b) {
        this.a = b;
        this.b = fz7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fz7 fz7Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz7Var.b0 = floatValue;
                fz7Var.h(floatValue);
                fz7Var.setAlpha(fz7Var.b0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6 b6Var = fz7Var.e;
                b6Var.setScaleX(hl.R1(0.8f, 1.0f, floatValue2));
                b6Var.setScaleY(hl.R1(0.8f, 1.0f, floatValue2));
                b6Var.setAlpha(hl.R1(0.0f, 1.0f, floatValue2));
                TextView textView = fz7Var.x;
                textView.setScaleX(hl.R1(1.0f, 0.9f, floatValue2));
                textView.setScaleY(hl.R1(1.0f, 0.9f, floatValue2));
                textView.setAlpha(hl.R1(1.0f, 0.0f, floatValue2));
                fz7Var.s.setAlpha(hl.R1(0.0f, 1.0f, floatValue2));
                break;
        }
    }
}
