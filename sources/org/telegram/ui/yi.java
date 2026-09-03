package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ yi(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.b;
                xnVar.ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.U0.invalidate();
                break;
            case 1:
                py pyVar = (py) this.b;
                pyVar.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((jd1) this.b).u0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
