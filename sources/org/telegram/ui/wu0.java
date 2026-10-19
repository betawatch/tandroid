package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fv0 b;

    public /* synthetic */ wu0(fv0 fv0Var, int i10) {
        this.a = i10;
        this.b = fv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fv0 fv0Var = this.b;
                fv0Var.getClass();
                fv0Var.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                fv0 fv0Var2 = this.b;
                fv0Var2.getClass();
                fv0Var2.R.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
