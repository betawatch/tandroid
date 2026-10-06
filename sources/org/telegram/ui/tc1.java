package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class tc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd1 b;

    public /* synthetic */ tc1(pd1 pd1Var, int i10) {
        this.a = i10;
        this.b = pd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                pd1 pd1Var = this.b;
                pd1Var.x0.invalidate();
                pd1Var.w0[1].setVisibility(8);
                pd1Var.c2 = null;
                break;
            case 1:
                this.b.B0 = null;
                break;
            case 2:
                pd1 pd1Var2 = this.b;
                if (pd1Var2.D0.getTag() == null) {
                    pd1Var2.D0.setVisibility(4);
                }
                pd1Var2.H0 = null;
                break;
            case 3:
                pd1 pd1Var3 = this.b;
                if (pd1Var3.E0.getTag() == null) {
                    pd1Var3.E0.setVisibility(4);
                }
                pd1Var3.I0 = null;
                break;
            case 4:
                pd1 pd1Var4 = this.b;
                mc mcVar = pd1Var4.h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) pd1Var4.h2.getParent()).removeView(pd1Var4.h2);
                    }
                    pd1Var4.h2 = null;
                }
                pd1Var4.j2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                pd1 pd1Var5 = this.b;
                if (!pd1Var5.p1.a()) {
                    pd1Var5.R1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
