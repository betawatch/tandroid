package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce0 b;

    public /* synthetic */ ra0(ce0 ce0Var, int i7) {
        this.a = i7;
        this.b = ce0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ce0 ce0Var = this.b;
                ce0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var.c.setAlpha(floatValue);
                ce0Var.c.setTranslationY((1.0f - floatValue) * org.telegram.messenger.g0.L(230.0f));
                break;
            case 1:
                ce0 ce0Var2 = this.b;
                ce0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f10 = (0.9f * floatValue2) + 0.1f;
                ce0Var2.W.setScaleX(f10);
                ce0Var2.W.setScaleY(f10);
                ce0Var2.W.setAlpha(floatValue2);
                break;
            default:
                ce0 ce0Var3 = this.b;
                ce0Var3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var3.c.setAlpha(floatValue3);
                ce0Var3.c.setTranslationY((1.0f - floatValue3) * org.telegram.messenger.g0.L(230.0f));
                break;
        }
    }
}
