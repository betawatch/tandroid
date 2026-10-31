package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ be1 b;

    public /* synthetic */ qd1(be1 be1Var, int i10) {
        this.a = i10;
        this.b = be1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ag.c2 c2Var;
        ag.c2 c2Var2;
        int i10 = this.a;
        be1 be1Var = this.b;
        switch (i10) {
            case 0:
                be1Var.i1 = null;
                be1Var.f1 = 1.0f;
                be1Var.Y0 = 0.0f;
                be1Var.Z0 = 0.0f;
                be1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.t1.d().a.setAlpha(1.0f);
                org.telegram.messenger.i0.h3(new wv0(this, 28), 200L);
                break;
            case 2:
                be1Var.L0.e();
                be1Var.Y.setCornerRadius(-1.0f);
                be1Var.E0 = false;
                be1Var.Y.b0 = false;
                be1Var.q0 = be1Var.p0;
                be1Var.G();
                break;
            case 3:
                for (org.telegram.ui.Components.g9 g9Var : be1Var.V) {
                    org.telegram.ui.Components.f5 f5Var = g9Var.e;
                    if (f5Var != null && (c2Var = f5Var.k) != null) {
                        c2Var.t0 = true;
                        c2Var.P0(false);
                    }
                }
                break;
            case 4:
                be1Var.A();
                for (org.telegram.ui.Components.g9 g9Var2 : be1Var.V) {
                    org.telegram.ui.Components.f5 f5Var2 = g9Var2.e;
                    if (f5Var2 != null && (c2Var2 = f5Var2.k) != null) {
                        c2Var2.t0 = false;
                        c2Var2.Q0();
                    }
                }
                be1Var.R.setVisibility(8);
                break;
            case 5:
                be1Var.E.setText(org.telegram.messenger.cd.L0(2131743516, null));
                be1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (be1Var.Z.getTag() == null) {
                    be1Var.Z.setVisibility(8);
                    break;
                }
                break;
            case 7:
                be1Var.Y.setTranslationX(0.0f);
                be1Var.Y.setTranslationY(0.0f);
                be1Var.Y.setScaleY(1.0f);
                be1Var.Y.setScaleX(1.0f);
                be1Var.Y.setVisibility(8);
                break;
            case 8:
                be1Var.D.setVisibility(8);
                break;
            default:
                be1Var.e0.setVisibility(8);
                break;
        }
    }
}
