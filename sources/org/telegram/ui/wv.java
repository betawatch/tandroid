package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                yyVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                yy yyVar2 = this.b;
                yyVar2.getClass();
                yyVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
