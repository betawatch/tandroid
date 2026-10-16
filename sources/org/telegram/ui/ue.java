package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ ue(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo foVar = this.b;
                foVar.K8 = floatValue;
                xm xmVar = foVar.X0;
                if (xmVar != null) {
                    xmVar.invalidate();
                    foVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                fo foVar2 = this.b;
                foVar2.getClass();
                foVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar2.pc();
                break;
            case 2:
                fo foVar3 = this.b;
                foVar3.getClass();
                foVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar3.pc();
                break;
            case 3:
                fo foVar4 = this.b;
                foVar4.getClass();
                foVar4.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar4.t9();
                break;
            default:
                fo foVar5 = this.b;
                foVar5.getClass();
                foVar5.Ea = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                foVar5.t9();
                break;
        }
    }
}
