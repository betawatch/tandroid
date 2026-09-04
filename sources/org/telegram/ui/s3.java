package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;

    public /* synthetic */ s3(v3 v3Var, int i10) {
        this.a = i10;
        this.b = v3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var = this.b;
                v3Var.I = floatValue;
                v3Var.c.invalidate();
                v3Var.i();
                v3Var.h();
                break;
            case 1:
                v3 v3Var2 = this.b;
                v3Var2.getClass();
                v3Var2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3 v3Var3 = this.b;
                v3Var3.x = floatValue2;
                if (!v3Var3.n) {
                    v3Var3.n();
                }
                v3Var3.i();
                v3Var3.h();
                break;
        }
    }
}
