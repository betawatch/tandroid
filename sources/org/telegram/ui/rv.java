package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ rv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                uyVar.getClass();
                uyVar.I4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.M4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                uy uyVar2 = this.b;
                uyVar2.getClass();
                uyVar2.O4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
