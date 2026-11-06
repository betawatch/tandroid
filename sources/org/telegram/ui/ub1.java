package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ub1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec1 b;

    public /* synthetic */ ub1(ec1 ec1Var, int i7) {
        this.a = i7;
        this.b = ec1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.a;
        ec1 ec1Var = this.b;
        switch (i7) {
            case 0:
                ec1Var.h1 = null;
                ec1Var.e1 = 1.0f;
                ec1Var.X0 = 0.0f;
                ec1Var.Y0 = 0.0f;
                ec1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.e2.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new ru0(this, 26), 200L);
                break;
            case 2:
                ec1Var.K0.e();
                ec1Var.Y.setCornerRadius(-1.0f);
                ec1Var.D0 = false;
                ec1Var.Y.b0 = false;
                ec1Var.p0 = ec1Var.o0;
                ec1Var.y();
                break;
            case 3:
                for (org.telegram.ui.Components.l9 l9Var : ec1Var.V) {
                    org.telegram.ui.Components.i5 i5Var = l9Var.e;
                    if (i5Var != null && (z2Var = i5Var.k) != null) {
                        z2Var.t0 = true;
                        z2Var.P0(false);
                    }
                }
                break;
            case 4:
                ec1Var.s();
                for (org.telegram.ui.Components.l9 l9Var2 : ec1Var.V) {
                    org.telegram.ui.Components.i5 i5Var2 = l9Var2.e;
                    if (i5Var2 != null && (z2Var2 = i5Var2.k) != null) {
                        z2Var2.t0 = false;
                        z2Var2.Q0();
                    }
                }
                ec1Var.R.setVisibility(8);
                break;
            case 5:
                ec1Var.E.setText(org.telegram.messenger.hd.M0(2131743491, null));
                ec1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (ec1Var.Z.getTag() == null) {
                    ec1Var.Z.setVisibility(8);
                    break;
                }
                break;
            case 7:
                ec1Var.Y.setTranslationX(0.0f);
                ec1Var.Y.setTranslationY(0.0f);
                ec1Var.Y.setScaleY(1.0f);
                ec1Var.Y.setScaleX(1.0f);
                ec1Var.Y.setVisibility(8);
                break;
            case 8:
                ec1Var.D.setVisibility(8);
                break;
            default:
                ec1Var.e0.setVisibility(8);
                break;
        }
    }
}
