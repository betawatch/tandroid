package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        fi.u2 u2Var;
        fi.u2 u2Var2;
        int i7 = this.a;
        ec1 ec1Var = this.b;
        switch (i7) {
            case 0:
                ec1Var.i1 = null;
                ec1Var.f1 = 1.0f;
                ec1Var.Y0 = 0.0f;
                ec1Var.Z0 = 0.0f;
                ec1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.i2.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new pu0(this, 26), 200L);
                break;
            case 2:
                ec1Var.L0.e();
                ec1Var.Z.setCornerRadius(-1.0f);
                ec1Var.E0 = false;
                ec1Var.Z.c0 = false;
                ec1Var.q0 = ec1Var.p0;
                ec1Var.y();
                break;
            case 3:
                for (org.telegram.ui.Components.i9 i9Var : ec1Var.W) {
                    org.telegram.ui.Components.g5 g5Var = i9Var.e;
                    if (g5Var != null && (u2Var = g5Var.k) != null) {
                        u2Var.u0 = true;
                        u2Var.P0(false);
                    }
                }
                break;
            case 4:
                ec1Var.s();
                for (org.telegram.ui.Components.i9 i9Var2 : ec1Var.W) {
                    org.telegram.ui.Components.g5 g5Var2 = i9Var2.e;
                    if (g5Var2 != null && (u2Var2 = g5Var2.k) != null) {
                        u2Var2.u0 = false;
                        u2Var2.Q0();
                    }
                }
                ec1Var.S.setVisibility(8);
                break;
            case 5:
                ec1Var.F.setText(org.telegram.messenger.hd.M0(2131743490, null));
                ec1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (ec1Var.a0.getTag() == null) {
                    ec1Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 7:
                ec1Var.Z.setTranslationX(0.0f);
                ec1Var.Z.setTranslationY(0.0f);
                ec1Var.Z.setScaleY(1.0f);
                ec1Var.Z.setScaleX(1.0f);
                ec1Var.Z.setVisibility(8);
                break;
            case 8:
                ec1Var.E.setVisibility(8);
                break;
            default:
                ec1Var.f0.setVisibility(8);
                break;
        }
    }
}
