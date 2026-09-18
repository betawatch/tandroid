package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class zc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd1 b;

    public /* synthetic */ zc1(vd1 vd1Var, int i10) {
        this.a = i10;
        this.b = vd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                vd1 vd1Var = this.b;
                vd1Var.x0.invalidate();
                vd1Var.w0[1].setVisibility(8);
                vd1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                vd1 vd1Var2 = this.b;
                if (vd1Var2.D0.getTag() == null) {
                    vd1Var2.D0.setVisibility(4);
                }
                vd1Var2.H0 = null;
                break;
            case 3:
                vd1 vd1Var3 = this.b;
                if (vd1Var3.E0.getTag() == null) {
                    vd1Var3.E0.setVisibility(4);
                }
                vd1Var3.I0 = null;
                break;
            case 4:
                vd1 vd1Var4 = this.b;
                mc mcVar = vd1Var4.h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) vd1Var4.h2.getParent()).removeView(vd1Var4.h2);
                    }
                    vd1Var4.h2 = null;
                }
                vd1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                vd1 vd1Var5 = this.b;
                if (!vd1Var5.p1.a()) {
                    vd1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
