package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ View c;

    public /* synthetic */ te(an anVar, org.telegram.ui.Cells.t0 t0Var, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = t0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.T9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                anVar.K9();
                this.c.setAlpha(floatValue);
                break;
            default:
                an anVar2 = this.b;
                anVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.T9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                anVar2.K9();
                anVar2.M9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
