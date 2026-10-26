package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc1 b;

    public /* synthetic */ wb1(tc1 tc1Var, int i10) {
        this.a = i10;
        this.b = tc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                tc1 tc1Var = this.b;
                tc1Var.y0.invalidate();
                tc1Var.x0[1].setVisibility(8);
                tc1Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                tc1 tc1Var2 = this.b;
                if (tc1Var2.E0.getTag() == null) {
                    tc1Var2.E0.setVisibility(4);
                }
                tc1Var2.I0 = null;
                break;
            case 3:
                tc1 tc1Var3 = this.b;
                if (tc1Var3.F0.getTag() == null) {
                    tc1Var3.F0.setVisibility(4);
                }
                tc1Var3.J0 = null;
                break;
            case 4:
                tc1 tc1Var4 = this.b;
                mc mcVar = tc1Var4.i2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) tc1Var4.i2.getParent()).removeView(tc1Var4.i2);
                    }
                    tc1Var4.i2 = null;
                }
                tc1Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                tc1 tc1Var5 = this.b;
                if (!tc1Var5.q1.a()) {
                    tc1Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
