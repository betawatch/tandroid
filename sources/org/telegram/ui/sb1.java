package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc1 b;

    public /* synthetic */ sb1(oc1 oc1Var, int i9) {
        this.a = i9;
        this.b = oc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                oc1 oc1Var = this.b;
                oc1Var.t0.invalidate();
                oc1Var.s0[1].setVisibility(8);
                oc1Var.Y1 = null;
                break;
            case 1:
                this.b.x0 = null;
                break;
            case 2:
                oc1 oc1Var2 = this.b;
                if (oc1Var2.z0.getTag() == null) {
                    oc1Var2.z0.setVisibility(4);
                }
                oc1Var2.D0 = null;
                break;
            case 3:
                oc1 oc1Var3 = this.b;
                if (oc1Var3.A0.getTag() == null) {
                    oc1Var3.A0.setVisibility(4);
                }
                oc1Var3.E0 = null;
                break;
            case 4:
                oc1 oc1Var4 = this.b;
                gc gcVar = oc1Var4.d2;
                if (gcVar != null) {
                    if (gcVar.getParent() != null) {
                        ((ViewGroup) oc1Var4.d2.getParent()).removeView(oc1Var4.d2);
                    }
                    oc1Var4.d2 = null;
                }
                oc1Var4.f2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                oc1 oc1Var5 = this.b;
                if (!oc1Var5.l1.a()) {
                    oc1Var5.N1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
