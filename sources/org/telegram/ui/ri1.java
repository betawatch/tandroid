package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ri1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj1 b;

    public /* synthetic */ ri1(dj1 dj1Var, int i10) {
        this.a = i10;
        this.b = dj1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bi.b4 b4Var;
        bi.b4 b4Var2;
        switch (this.a) {
            case 0:
                dj1 dj1Var = this.b;
                dj1Var.i1 = null;
                dj1Var.f1 = 1.0f;
                dj1Var.Y0 = 0.0f;
                dj1Var.Z0 = 0.0f;
                dj1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.k2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new uz0(this, 24), 200L);
                break;
            case 2:
                dj1 dj1Var2 = this.b;
                dj1Var2.L0.unlock();
                dj1Var2.Y.setCornerRadius(-1.0f);
                dj1Var2.E0 = false;
                dj1Var2.Y.b0 = false;
                dj1Var2.q0 = dj1Var2.p0;
                dj1Var2.G();
                break;
            case 3:
                for (org.telegram.ui.Components.z9 z9Var : this.b.V) {
                    org.telegram.ui.Components.s5 s5Var = z9Var.e;
                    if (s5Var != null && (b4Var = s5Var.k) != null) {
                        b4Var.setAllowStartAnimation(true);
                        z9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                dj1 dj1Var3 = this.b;
                dj1Var3.A();
                for (org.telegram.ui.Components.z9 z9Var2 : dj1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = z9Var2.e;
                    if (s5Var2 != null && (b4Var2 = s5Var2.k) != null) {
                        b4Var2.setAllowStartAnimation(false);
                        z9Var2.e.k.stopAnimation();
                    }
                }
                dj1Var3.R.setVisibility(8);
                break;
            case 5:
                dj1 dj1Var4 = this.b;
                if (dj1Var4.Z.getTag() == null) {
                    dj1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                dj1 dj1Var5 = this.b;
                dj1Var5.Y.setTranslationX(0.0f);
                dj1Var5.Y.setTranslationY(0.0f);
                dj1Var5.Y.setScaleY(1.0f);
                dj1Var5.Y.setScaleX(1.0f);
                dj1Var5.Y.setVisibility(8);
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
