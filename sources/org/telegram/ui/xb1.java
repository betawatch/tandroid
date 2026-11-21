package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class xb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc1 b;

    public /* synthetic */ xb1(hc1 hc1Var, int i7) {
        this.a = i7;
        this.b = hc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fi.s2 s2Var;
        fi.s2 s2Var2;
        int i7 = this.a;
        hc1 hc1Var = this.b;
        switch (i7) {
            case 0:
                hc1Var.i1 = null;
                hc1Var.f1 = 1.0f;
                hc1Var.Y0 = 0.0f;
                hc1Var.Z0 = 0.0f;
                hc1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.h2.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.h3(new ru0(this, 26), 200L);
                break;
            case 2:
                hc1Var.L0.e();
                hc1Var.Z.setCornerRadius(-1.0f);
                hc1Var.E0 = false;
                hc1Var.Z.c0 = false;
                hc1Var.q0 = hc1Var.p0;
                hc1Var.y();
                break;
            case 3:
                for (org.telegram.ui.Components.q9 q9Var : hc1Var.W) {
                    org.telegram.ui.Components.p5 p5Var = q9Var.e;
                    if (p5Var != null && (s2Var = p5Var.k) != null) {
                        s2Var.u0 = true;
                        s2Var.P0(false);
                    }
                }
                break;
            case 4:
                hc1Var.s();
                for (org.telegram.ui.Components.q9 q9Var2 : hc1Var.W) {
                    org.telegram.ui.Components.p5 p5Var2 = q9Var2.e;
                    if (p5Var2 != null && (s2Var2 = p5Var2.k) != null) {
                        s2Var2.u0 = false;
                        s2Var2.Q0();
                    }
                }
                hc1Var.S.setVisibility(8);
                break;
            case 5:
                hc1Var.F.setText(org.telegram.messenger.gd.N0(2131743247, null));
                hc1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (hc1Var.a0.getTag() == null) {
                    hc1Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 7:
                hc1Var.Z.setTranslationX(0.0f);
                hc1Var.Z.setTranslationY(0.0f);
                hc1Var.Z.setScaleY(1.0f);
                hc1Var.Z.setScaleX(1.0f);
                hc1Var.Z.setVisibility(8);
                break;
            case 8:
                hc1Var.E.setVisibility(8);
                break;
            default:
                hc1Var.f0.setVisibility(8);
                break;
        }
    }
}
