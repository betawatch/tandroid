package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class x61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t71 b;

    public /* synthetic */ x61(t71 t71Var, int i7) {
        this.a = i7;
        this.b = t71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                t71 t71Var = this.b;
                t71Var.z0.invalidate();
                t71Var.y0[1].setVisibility(8);
                t71Var.e2 = null;
                break;
            case 1:
                this.b.D0 = null;
                break;
            case 2:
                t71 t71Var2 = this.b;
                if (t71Var2.F0.getTag() == null) {
                    t71Var2.F0.setVisibility(4);
                }
                t71Var2.J0 = null;
                break;
            case 3:
                t71 t71Var3 = this.b;
                if (t71Var3.G0.getTag() == null) {
                    t71Var3.G0.setVisibility(4);
                }
                t71Var3.K0 = null;
                break;
            case 4:
                t71 t71Var4 = this.b;
                bc bcVar = t71Var4.j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) t71Var4.j2.getParent()).removeView(t71Var4.j2);
                    }
                    t71Var4.j2 = null;
                }
                t71Var4.l2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                t71 t71Var5 = this.b;
                if (!t71Var5.r1.a()) {
                    t71Var5.T1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
