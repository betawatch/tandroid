package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ sn(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar = this.b;
                tnVar.f = floatValue;
                View view = tnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar2 = this.b;
                tnVar2.f = floatValue2;
                View view2 = tnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar3 = this.b;
                tnVar3.f = floatValue3;
                View view3 = tnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
