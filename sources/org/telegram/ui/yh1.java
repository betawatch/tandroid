package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class yh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki1 b;

    public /* synthetic */ yh1(ki1 ki1Var, int i10) {
        this.a = i10;
        this.b = ki1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ai.l4 l4Var;
        ai.l4 l4Var2;
        switch (this.a) {
            case 0:
                ki1 ki1Var = this.b;
                ki1Var.i1 = null;
                ki1Var.f1 = 1.0f;
                ki1Var.Y0 = 0.0f;
                ki1Var.Z0 = 0.0f;
                ki1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.n2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new hz0(this, 25), 200L);
                break;
            case 2:
                ki1 ki1Var2 = this.b;
                ki1Var2.L0.unlock();
                ki1Var2.Y.setCornerRadius(-1.0f);
                ki1Var2.E0 = false;
                ki1Var2.Y.b0 = false;
                ki1Var2.q0 = ki1Var2.p0;
                ki1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.b.V) {
                    org.telegram.ui.Components.q5 q5Var = w9Var.e;
                    if (q5Var != null && (l4Var = q5Var.k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        w9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                ki1 ki1Var3 = this.b;
                ki1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : ki1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = w9Var2.e;
                    if (q5Var2 != null && (l4Var2 = q5Var2.k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        w9Var2.e.k.stopAnimation();
                    }
                }
                ki1Var3.R.setVisibility(8);
                break;
            case 5:
                ki1 ki1Var4 = this.b;
                if (ki1Var4.Z.getTag() == null) {
                    ki1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ki1 ki1Var5 = this.b;
                ki1Var5.Y.setTranslationX(0.0f);
                ki1Var5.Y.setTranslationY(0.0f);
                ki1Var5.Y.setScaleY(1.0f);
                ki1Var5.Y.setScaleX(1.0f);
                ki1Var5.Y.setVisibility(8);
                break;
            case 7:
                this.b.y.setVisibility(8);
                break;
            default:
                this.b.e0.setVisibility(8);
                break;
        }
    }
}
