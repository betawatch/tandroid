package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ qi(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = o2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                qnVar.ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.T0.invalidate();
                break;
            case 1:
                dy dyVar = (dy) this.b;
                dyVar.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = dyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((oc1) this.b).t0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
