package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ View c;

    public /* synthetic */ qe(wm wmVar, org.telegram.ui.Cells.t0 t0Var, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = t0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                wmVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar.U9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                wmVar.K9();
                this.c.setAlpha(floatValue);
                break;
            default:
                wm wmVar2 = this.b;
                wmVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmVar2.U9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                wmVar2.K9();
                wmVar2.M9();
                this.c.setAlpha(floatValue2);
                break;
        }
    }
}
