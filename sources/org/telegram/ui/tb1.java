package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc1 b;

    public /* synthetic */ tb1(qc1 qc1Var, int i10) {
        this.a = i10;
        this.b = qc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                qc1 qc1Var = this.b;
                qc1Var.t0.invalidate();
                qc1Var.s0[1].setVisibility(8);
                qc1Var.Y1 = null;
                break;
            case 1:
                this.b.x0 = null;
                break;
            case 2:
                qc1 qc1Var2 = this.b;
                if (qc1Var2.z0.getTag() == null) {
                    qc1Var2.z0.setVisibility(4);
                }
                qc1Var2.D0 = null;
                break;
            case 3:
                qc1 qc1Var3 = this.b;
                if (qc1Var3.A0.getTag() == null) {
                    qc1Var3.A0.setVisibility(4);
                }
                qc1Var3.E0 = null;
                break;
            case 4:
                qc1 qc1Var4 = this.b;
                fc fcVar = qc1Var4.d2;
                if (fcVar != null) {
                    if (fcVar.getParent() != null) {
                        ((ViewGroup) qc1Var4.d2.getParent()).removeView(qc1Var4.d2);
                    }
                    qc1Var4.d2 = null;
                }
                qc1Var4.f2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                qc1 qc1Var5 = this.b;
                if (!qc1Var5.l1.a()) {
                    qc1Var5.N1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
