package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc1 b;

    public /* synthetic */ vb1(fc1 fc1Var, int i7) {
        this.a = i7;
        this.b = fc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fi.s2 s2Var;
        fi.s2 s2Var2;
        int i7 = this.a;
        fc1 fc1Var = this.b;
        switch (i7) {
            case 0:
                fc1Var.i1 = null;
                fc1Var.f1 = 1.0f;
                fc1Var.Y0 = 0.0f;
                fc1Var.Z0 = 0.0f;
                fc1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.i2.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.h3(new qu0(this, 26), 200L);
                break;
            case 2:
                fc1Var.L0.e();
                fc1Var.Z.setCornerRadius(-1.0f);
                fc1Var.E0 = false;
                fc1Var.Z.c0 = false;
                fc1Var.q0 = fc1Var.p0;
                fc1Var.y();
                break;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : fc1Var.W) {
                    org.telegram.ui.Components.o5 o5Var = p9Var.e;
                    if (o5Var != null && (s2Var = o5Var.k) != null) {
                        s2Var.u0 = true;
                        s2Var.Q0(false);
                    }
                }
                break;
            case 4:
                fc1Var.s();
                for (org.telegram.ui.Components.p9 p9Var2 : fc1Var.W) {
                    org.telegram.ui.Components.o5 o5Var2 = p9Var2.e;
                    if (o5Var2 != null && (s2Var2 = o5Var2.k) != null) {
                        s2Var2.u0 = false;
                        s2Var2.R0();
                    }
                }
                fc1Var.S.setVisibility(8);
                break;
            case 5:
                fc1Var.F.setText(org.telegram.messenger.gd.N0(2131743240, null));
                fc1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (fc1Var.a0.getTag() == null) {
                    fc1Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 7:
                fc1Var.Z.setTranslationX(0.0f);
                fc1Var.Z.setTranslationY(0.0f);
                fc1Var.Z.setScaleY(1.0f);
                fc1Var.Z.setScaleX(1.0f);
                fc1Var.Z.setVisibility(8);
                break;
            case 8:
                fc1Var.E.setVisibility(8);
                break;
            default:
                fc1Var.f0.setVisibility(8);
                break;
        }
    }
}
