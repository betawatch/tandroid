package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class vg1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ vg1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ci.g3 g3Var;
        ci.g3 g3Var2;
        switch (this.a) {
            case 0:
                hh1 hh1Var = this.b;
                hh1Var.i1 = null;
                hh1Var.f1 = 1.0f;
                hh1Var.Y0 = 0.0f;
                hh1Var.Z0 = 0.0f;
                hh1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.k2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new qy0(this, 24), 200L);
                break;
            case 2:
                hh1 hh1Var2 = this.b;
                hh1Var2.L0.unlock();
                hh1Var2.Y.setCornerRadius(-1.0f);
                hh1Var2.E0 = false;
                hh1Var2.Y.b0 = false;
                hh1Var2.q0 = hh1Var2.p0;
                hh1Var2.G();
                break;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.b.V) {
                    org.telegram.ui.Components.r5 r5Var = w9Var.e;
                    if (r5Var != null && (g3Var = r5Var.k) != null) {
                        g3Var.setAllowStartAnimation(true);
                        w9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                hh1 hh1Var3 = this.b;
                hh1Var3.A();
                for (org.telegram.ui.Components.w9 w9Var2 : hh1Var3.V) {
                    org.telegram.ui.Components.r5 r5Var2 = w9Var2.e;
                    if (r5Var2 != null && (g3Var2 = r5Var2.k) != null) {
                        g3Var2.setAllowStartAnimation(false);
                        w9Var2.e.k.stopAnimation();
                    }
                }
                hh1Var3.R.setVisibility(8);
                break;
            case 5:
                hh1 hh1Var4 = this.b;
                if (hh1Var4.Z.getTag() == null) {
                    hh1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                hh1 hh1Var5 = this.b;
                hh1Var5.Y.setTranslationX(0.0f);
                hh1Var5.Y.setTranslationY(0.0f);
                hh1Var5.Y.setScaleY(1.0f);
                hh1Var5.Y.setScaleX(1.0f);
                hh1Var5.Y.setVisibility(8);
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
