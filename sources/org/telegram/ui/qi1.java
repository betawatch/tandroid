package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj1 b;

    public /* synthetic */ qi1(cj1 cj1Var, int i10) {
        this.a = i10;
        this.b = cj1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bi.b4 b4Var;
        bi.b4 b4Var2;
        switch (this.a) {
            case 0:
                cj1 cj1Var = this.b;
                cj1Var.i1 = null;
                cj1Var.f1 = 1.0f;
                cj1Var.Y0 = 0.0f;
                cj1Var.Z0 = 0.0f;
                cj1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.k2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new tz0(this, 24), 200L);
                break;
            case 2:
                cj1 cj1Var2 = this.b;
                cj1Var2.L0.unlock();
                cj1Var2.Y.setCornerRadius(-1.0f);
                cj1Var2.E0 = false;
                cj1Var2.Y.b0 = false;
                cj1Var2.q0 = cj1Var2.p0;
                cj1Var2.G();
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
                cj1 cj1Var3 = this.b;
                cj1Var3.A();
                for (org.telegram.ui.Components.z9 z9Var2 : cj1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = z9Var2.e;
                    if (s5Var2 != null && (b4Var2 = s5Var2.k) != null) {
                        b4Var2.setAllowStartAnimation(false);
                        z9Var2.e.k.stopAnimation();
                    }
                }
                cj1Var3.R.setVisibility(8);
                break;
            case 5:
                cj1 cj1Var4 = this.b;
                if (cj1Var4.Z.getTag() == null) {
                    cj1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                cj1 cj1Var5 = this.b;
                cj1Var5.Y.setTranslationX(0.0f);
                cj1Var5.Y.setTranslationY(0.0f);
                cj1Var5.Y.setScaleY(1.0f);
                cj1Var5.Y.setScaleX(1.0f);
                cj1Var5.Y.setVisibility(8);
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
