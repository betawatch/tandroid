package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ View c;

    public /* synthetic */ ue(bn bnVar, org.telegram.ui.Cells.u0 u0Var, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = u0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                bnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.X9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                bnVar.M9();
                this.c.setAlpha(floatValue);
                break;
            default:
                bn bnVar2 = this.b;
                bnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.X9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                bnVar2.M9();
                bnVar2.O9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
