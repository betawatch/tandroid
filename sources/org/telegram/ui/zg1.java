package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zg1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh1 b;

    public /* synthetic */ zg1(lh1 lh1Var, int i10) {
        this.a = i10;
        this.b = lh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jh.y2 y2Var;
        jh.y2 y2Var2;
        switch (this.a) {
            case 0:
                lh1 lh1Var = this.b;
                lh1Var.e1 = null;
                lh1Var.b1 = 1.0f;
                lh1Var.U0 = 0.0f;
                lh1Var.V0 = 0.0f;
                lh1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.l2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new ky0(this, 25), 200L);
                break;
            case 2:
                lh1 lh1Var2 = this.b;
                lh1Var2.H0.unlock();
                lh1Var2.U.setCornerRadius(-1.0f);
                lh1Var2.A0 = false;
                lh1Var2.U.U = false;
                lh1Var2.m0 = lh1Var2.l0;
                lh1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.n9 n9Var : this.b.R) {
                    org.telegram.ui.Components.k5 k5Var = n9Var.e;
                    if (k5Var != null && (y2Var = k5Var.k) != null) {
                        y2Var.setAllowStartAnimation(true);
                        n9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                lh1 lh1Var3 = this.b;
                lh1Var3.B();
                for (org.telegram.ui.Components.n9 n9Var2 : lh1Var3.R) {
                    org.telegram.ui.Components.k5 k5Var2 = n9Var2.e;
                    if (k5Var2 != null && (y2Var2 = k5Var2.k) != null) {
                        y2Var2.setAllowStartAnimation(false);
                        n9Var2.e.k.stopAnimation();
                    }
                }
                lh1Var3.N.setVisibility(8);
                break;
            case 5:
                lh1 lh1Var4 = this.b;
                if (lh1Var4.V.getTag() == null) {
                    lh1Var4.V.setVisibility(8);
                    break;
                }
                break;
            case 6:
                lh1 lh1Var5 = this.b;
                lh1Var5.U.setTranslationX(0.0f);
                lh1Var5.U.setTranslationY(0.0f);
                lh1Var5.U.setScaleY(1.0f);
                lh1Var5.U.setScaleX(1.0f);
                lh1Var5.U.setVisibility(8);
                break;
            case 7:
                this.b.y.setVisibility(8);
                break;
            default:
                this.b.a0.setVisibility(8);
                break;
        }
    }
}
