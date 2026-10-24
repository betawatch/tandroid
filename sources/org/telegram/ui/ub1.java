package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ub1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ ub1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                qc1 qc1Var = this.b;
                qc1Var.y0.invalidate();
                qc1Var.x0[1].setVisibility(8);
                qc1Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                qc1 qc1Var2 = this.b;
                if (qc1Var2.E0.getTag() == null) {
                    qc1Var2.E0.setVisibility(4);
                }
                qc1Var2.I0 = null;
                break;
            case 3:
                qc1 qc1Var3 = this.b;
                if (qc1Var3.F0.getTag() == null) {
                    qc1Var3.F0.setVisibility(4);
                }
                qc1Var3.J0 = null;
                break;
            case 4:
                qc1 qc1Var4 = this.b;
                lc lcVar = qc1Var4.i2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) qc1Var4.i2.getParent()).removeView(qc1Var4.i2);
                    }
                    qc1Var4.i2 = null;
                }
                qc1Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                qc1 qc1Var5 = this.b;
                if (!qc1Var5.q1.a()) {
                    qc1Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
