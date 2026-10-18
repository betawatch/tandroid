package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class xg1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh1 b;

    public /* synthetic */ xg1(jh1 jh1Var, int i10) {
        this.a = i10;
        this.b = jh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ci.f3 f3Var;
        ci.f3 f3Var2;
        switch (this.a) {
            case 0:
                jh1 jh1Var = this.b;
                jh1Var.i1 = null;
                jh1Var.f1 = 1.0f;
                jh1Var.Y0 = 0.0f;
                jh1Var.Z0 = 0.0f;
                jh1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.k2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new sy0(this, 24), 200L);
                break;
            case 2:
                jh1 jh1Var2 = this.b;
                jh1Var2.L0.unlock();
                jh1Var2.Y.setCornerRadius(-1.0f);
                jh1Var2.E0 = false;
                jh1Var2.Y.b0 = false;
                jh1Var2.q0 = jh1Var2.p0;
                jh1Var2.G();
                break;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.b.V) {
                    org.telegram.ui.Components.r5 r5Var = w9Var.e;
                    if (r5Var != null && (f3Var = r5Var.k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        w9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                jh1 jh1Var3 = this.b;
                jh1Var3.A();
                for (org.telegram.ui.Components.w9 w9Var2 : jh1Var3.V) {
                    org.telegram.ui.Components.r5 r5Var2 = w9Var2.e;
                    if (r5Var2 != null && (f3Var2 = r5Var2.k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        w9Var2.e.k.stopAnimation();
                    }
                }
                jh1Var3.R.setVisibility(8);
                break;
            case 5:
                jh1 jh1Var4 = this.b;
                if (jh1Var4.Z.getTag() == null) {
                    jh1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                jh1 jh1Var5 = this.b;
                jh1Var5.Y.setTranslationX(0.0f);
                jh1Var5.Y.setTranslationY(0.0f);
                jh1Var5.Y.setScaleY(1.0f);
                jh1Var5.Y.setScaleX(1.0f);
                jh1Var5.Y.setVisibility(8);
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
