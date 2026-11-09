package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic1 b;

    public /* synthetic */ yb1(ic1 ic1Var, int i7) {
        this.a = i7;
        this.b = ic1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.a;
        ic1 ic1Var = this.b;
        switch (i7) {
            case 0:
                ic1Var.h1 = null;
                ic1Var.e1 = 1.0f;
                ic1Var.X0 = 0.0f;
                ic1Var.Y0 = 0.0f;
                ic1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.e2.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new tu0(this, 26), 200L);
                break;
            case 2:
                ic1Var.K0.e();
                ic1Var.Y.setCornerRadius(-1.0f);
                ic1Var.D0 = false;
                ic1Var.Y.b0 = false;
                ic1Var.p0 = ic1Var.o0;
                ic1Var.y();
                break;
            case 3:
                for (org.telegram.ui.Components.l9 l9Var : ic1Var.V) {
                    org.telegram.ui.Components.i5 i5Var = l9Var.e;
                    if (i5Var != null && (z2Var = i5Var.k) != null) {
                        z2Var.t0 = true;
                        z2Var.P0(false);
                    }
                }
                break;
            case 4:
                ic1Var.s();
                for (org.telegram.ui.Components.l9 l9Var2 : ic1Var.V) {
                    org.telegram.ui.Components.i5 i5Var2 = l9Var2.e;
                    if (i5Var2 != null && (z2Var2 = i5Var2.k) != null) {
                        z2Var2.t0 = false;
                        z2Var2.Q0();
                    }
                }
                ic1Var.R.setVisibility(8);
                break;
            case 5:
                ic1Var.E.setText(org.telegram.messenger.id.M0(2131743490, null));
                ic1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (ic1Var.Z.getTag() == null) {
                    ic1Var.Z.setVisibility(8);
                    break;
                }
                break;
            case 7:
                ic1Var.Y.setTranslationX(0.0f);
                ic1Var.Y.setTranslationY(0.0f);
                ic1Var.Y.setScaleY(1.0f);
                ic1Var.Y.setScaleX(1.0f);
                ic1Var.Y.setVisibility(8);
                break;
            case 8:
                ic1Var.D.setVisibility(8);
                break;
            default:
                ic1Var.e0.setVisibility(8);
                break;
        }
    }
}
