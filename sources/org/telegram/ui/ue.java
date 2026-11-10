package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ View c;

    public /* synthetic */ ue(cn cnVar, org.telegram.ui.Cells.t0 t0Var, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = t0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                cnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.V9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                cnVar.L9();
                this.c.setAlpha(floatValue);
                break;
            default:
                cn cnVar2 = this.b;
                cnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar2.V9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                cnVar2.L9();
                cnVar2.N9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
