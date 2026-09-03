package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii1 b;

    public /* synthetic */ wh1(ii1 ii1Var, int i10) {
        this.a = i10;
        this.b = ii1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nh.y2 y2Var;
        nh.y2 y2Var2;
        switch (this.a) {
            case 0:
                ii1 ii1Var = this.b;
                ii1Var.f1 = null;
                ii1Var.c1 = 1.0f;
                ii1Var.V0 = 0.0f;
                ii1Var.W0 = 0.0f;
                ii1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.m2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new sz0(this, 23), 200L);
                break;
            case 2:
                ii1 ii1Var2 = this.b;
                ii1Var2.I0.unlock();
                ii1Var2.V.setCornerRadius(-1.0f);
                ii1Var2.B0 = false;
                ii1Var2.V.V = false;
                ii1Var2.n0 = ii1Var2.m0;
                ii1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : this.b.S) {
                    org.telegram.ui.Components.l5 l5Var = p9Var.e;
                    if (l5Var != null && (y2Var = l5Var.k) != null) {
                        y2Var.setAllowStartAnimation(true);
                        p9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                ii1 ii1Var3 = this.b;
                ii1Var3.B();
                for (org.telegram.ui.Components.p9 p9Var2 : ii1Var3.S) {
                    org.telegram.ui.Components.l5 l5Var2 = p9Var2.e;
                    if (l5Var2 != null && (y2Var2 = l5Var2.k) != null) {
                        y2Var2.setAllowStartAnimation(false);
                        p9Var2.e.k.stopAnimation();
                    }
                }
                ii1Var3.O.setVisibility(8);
                break;
            case 5:
                ii1 ii1Var4 = this.b;
                if (ii1Var4.W.getTag() == null) {
                    ii1Var4.W.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ii1 ii1Var5 = this.b;
                ii1Var5.V.setTranslationX(0.0f);
                ii1Var5.V.setTranslationY(0.0f);
                ii1Var5.V.setScaleY(1.0f);
                ii1Var5.V.setScaleX(1.0f);
                ii1Var5.V.setVisibility(8);
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
