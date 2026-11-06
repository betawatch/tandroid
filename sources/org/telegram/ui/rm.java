package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm b;

    public /* synthetic */ rm(sm smVar, int i7) {
        this.a = i7;
        this.b = smVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar = this.b;
                smVar.a = floatValue;
                View view = smVar.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar2 = this.b;
                smVar2.a = floatValue2;
                View view2 = smVar2.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar3 = this.b;
                smVar3.a = floatValue3;
                View view3 = smVar3.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
