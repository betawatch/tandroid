package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ yi(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                wnVar.Ba = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.j1.invalidate();
                break;
            case 1:
                ey eyVar = (ey) this.b;
                eyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                ((vc1) this.b).y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
