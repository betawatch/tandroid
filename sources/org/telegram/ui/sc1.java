package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ od1 b;

    public /* synthetic */ sc1(od1 od1Var, int i10) {
        this.a = i10;
        this.b = od1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                od1 od1Var = this.b;
                od1Var.x0.invalidate();
                od1Var.w0[1].setVisibility(8);
                od1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                od1 od1Var2 = this.b;
                if (od1Var2.D0.getTag() == null) {
                    od1Var2.D0.setVisibility(4);
                }
                od1Var2.H0 = null;
                break;
            case 3:
                od1 od1Var3 = this.b;
                if (od1Var3.E0.getTag() == null) {
                    od1Var3.E0.setVisibility(4);
                }
                od1Var3.I0 = null;
                break;
            case 4:
                od1 od1Var4 = this.b;
                kc kcVar = od1Var4.h2;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) od1Var4.h2.getParent()).removeView(od1Var4.h2);
                    }
                    od1Var4.h2 = null;
                }
                od1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                od1 od1Var5 = this.b;
                if (!od1Var5.p1.a()) {
                    od1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
