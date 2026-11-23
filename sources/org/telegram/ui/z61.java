package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v71 b;

    public /* synthetic */ z61(v71 v71Var, int i7) {
        this.a = i7;
        this.b = v71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                v71 v71Var = this.b;
                v71Var.z0.invalidate();
                v71Var.y0[1].setVisibility(8);
                v71Var.e2 = null;
                break;
            case 1:
                this.b.D0 = null;
                break;
            case 2:
                v71 v71Var2 = this.b;
                if (v71Var2.F0.getTag() == null) {
                    v71Var2.F0.setVisibility(4);
                }
                v71Var2.J0 = null;
                break;
            case 3:
                v71 v71Var3 = this.b;
                if (v71Var3.G0.getTag() == null) {
                    v71Var3.G0.setVisibility(4);
                }
                v71Var3.K0 = null;
                break;
            case 4:
                v71 v71Var4 = this.b;
                bc bcVar = v71Var4.j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) v71Var4.j2.getParent()).removeView(v71Var4.j2);
                    }
                    v71Var4.j2 = null;
                }
                v71Var4.l2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                v71 v71Var5 = this.b;
                if (!v71Var5.r1.b()) {
                    v71Var5.T1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
