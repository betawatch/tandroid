// default package

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class px7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ by7 b;

    public /* synthetic */ px7(by7 by7Var, byte b) {
        this.a = b;
        this.b = by7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        by7 by7Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6 a6Var = by7Var.e;
                a6Var.setScaleX(gm.R1(0.8f, 1.0f, floatValue));
                a6Var.setScaleY(gm.R1(0.8f, 1.0f, floatValue));
                a6Var.setAlpha(gm.R1(0.0f, 1.0f, floatValue));
                TextView textView = by7Var.x;
                textView.setScaleX(gm.R1(1.0f, 0.9f, floatValue));
                textView.setScaleY(gm.R1(1.0f, 0.9f, floatValue));
                textView.setAlpha(gm.R1(1.0f, 0.0f, floatValue));
                by7Var.s.setAlpha(gm.R1(0.0f, 1.0f, floatValue));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by7Var.b0 = floatValue2;
                by7Var.h(floatValue2);
                by7Var.setAlpha(by7Var.b0);
                break;
        }
    }
}
