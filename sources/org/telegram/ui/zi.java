package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class zi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ zi(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                wnVar.la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.X0.invalidate();
                break;
            case 1:
                qy qyVar = (qy) this.b;
                qyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((od1) this.b).x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
