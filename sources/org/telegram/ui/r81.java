package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ r81(m91 m91Var, int i10) {
        this.a = i10;
        this.b = m91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                m91 m91Var = this.b;
                m91Var.y0.invalidate();
                m91Var.x0[1].setVisibility(8);
                m91Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                m91 m91Var2 = this.b;
                if (m91Var2.E0.getTag() == null) {
                    m91Var2.E0.setVisibility(4);
                }
                m91Var2.I0 = null;
                break;
            case 3:
                m91 m91Var3 = this.b;
                if (m91Var3.F0.getTag() == null) {
                    m91Var3.F0.setVisibility(4);
                }
                m91Var3.J0 = null;
                break;
            case 4:
                m91 m91Var4 = this.b;
                ic icVar = m91Var4.i2;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) m91Var4.i2.getParent()).removeView(m91Var4.i2);
                    }
                    m91Var4.i2 = null;
                }
                m91Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                m91 m91Var5 = this.b;
                if (!m91Var5.q1.a()) {
                    m91Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
