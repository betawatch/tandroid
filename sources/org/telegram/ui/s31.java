package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ s31(v31 v31Var, int i10) {
        this.a = i10;
        this.b = v31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v31 v31Var = this.b;
                v31Var.getClass();
                v31Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.g();
                break;
            case 1:
                v31 v31Var2 = this.b;
                v31Var2.getClass();
                v31Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var2.g();
                break;
            default:
                v31 v31Var3 = this.b;
                v31Var3.getClass();
                v31Var3.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var3.g();
                break;
        }
    }
}
