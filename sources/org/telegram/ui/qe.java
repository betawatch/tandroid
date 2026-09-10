package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ qe(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eo eoVar = this.b;
                eoVar.K8 = floatValue;
                vm vmVar = eoVar.X0;
                if (vmVar != null) {
                    vmVar.invalidate();
                    eoVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                eo eoVar2 = this.b;
                eoVar2.getClass();
                eoVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar2.lc();
                break;
            case 2:
                eo eoVar3 = this.b;
                eoVar3.getClass();
                eoVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar3.lc();
                break;
            case 3:
                eo eoVar4 = this.b;
                eoVar4.getClass();
                eoVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar4.o9();
                break;
            default:
                eo eoVar5 = this.b;
                eoVar5.getClass();
                eoVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eoVar5.o9();
                break;
        }
    }
}
