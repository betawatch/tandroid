package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc1 b;

    public /* synthetic */ yb1(vc1 vc1Var, int i10) {
        this.a = i10;
        this.b = vc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                vc1 vc1Var = this.b;
                vc1Var.y0.invalidate();
                vc1Var.x0[1].setVisibility(8);
                vc1Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                vc1 vc1Var2 = this.b;
                if (vc1Var2.E0.getTag() == null) {
                    vc1Var2.E0.setVisibility(4);
                }
                vc1Var2.I0 = null;
                break;
            case 3:
                vc1 vc1Var3 = this.b;
                if (vc1Var3.F0.getTag() == null) {
                    vc1Var3.F0.setVisibility(4);
                }
                vc1Var3.J0 = null;
                break;
            case 4:
                vc1 vc1Var4 = this.b;
                mc mcVar = vc1Var4.i2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) vc1Var4.i2.getParent()).removeView(vc1Var4.i2);
                    }
                    vc1Var4.i2 = null;
                }
                vc1Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                vc1 vc1Var5 = this.b;
                if (!vc1Var5.q1.a()) {
                    vc1Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
