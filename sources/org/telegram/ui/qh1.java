package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci1 b;

    public /* synthetic */ qh1(ci1 ci1Var, int i10) {
        this.a = i10;
        this.b = ci1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oh.z2 z2Var;
        oh.z2 z2Var2;
        switch (this.a) {
            case 0:
                ci1 ci1Var = this.b;
                ci1Var.f1 = null;
                ci1Var.c1 = 1.0f;
                ci1Var.V0 = 0.0f;
                ci1Var.W0 = 0.0f;
                ci1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.n2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new xy0(this, 24), 200L);
                break;
            case 2:
                ci1 ci1Var2 = this.b;
                ci1Var2.I0.unlock();
                ci1Var2.V.setCornerRadius(-1.0f);
                ci1Var2.B0 = false;
                ci1Var2.V.V = false;
                ci1Var2.n0 = ci1Var2.m0;
                ci1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : this.b.S) {
                    org.telegram.ui.Components.l5 l5Var = p9Var.e;
                    if (l5Var != null && (z2Var = l5Var.k) != null) {
                        z2Var.setAllowStartAnimation(true);
                        p9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                ci1 ci1Var3 = this.b;
                ci1Var3.B();
                for (org.telegram.ui.Components.p9 p9Var2 : ci1Var3.S) {
                    org.telegram.ui.Components.l5 l5Var2 = p9Var2.e;
                    if (l5Var2 != null && (z2Var2 = l5Var2.k) != null) {
                        z2Var2.setAllowStartAnimation(false);
                        p9Var2.e.k.stopAnimation();
                    }
                }
                ci1Var3.O.setVisibility(8);
                break;
            case 5:
                ci1 ci1Var4 = this.b;
                if (ci1Var4.W.getTag() == null) {
                    ci1Var4.W.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ci1 ci1Var5 = this.b;
                ci1Var5.V.setTranslationX(0.0f);
                ci1Var5.V.setTranslationY(0.0f);
                ci1Var5.V.setScaleY(1.0f);
                ci1Var5.V.setScaleX(1.0f);
                ci1Var5.V.setVisibility(8);
                break;
            case 7:
                this.b.y.setVisibility(8);
                break;
            default:
                this.b.b0.setVisibility(8);
                break;
        }
    }
}
