package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ wv(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                yyVar.getClass();
                yyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                yy yyVar2 = this.b;
                yyVar2.getClass();
                yyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
