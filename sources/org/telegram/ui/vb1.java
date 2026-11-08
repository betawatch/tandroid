package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.a;
        fc1 fc1Var = this.b;
        switch (i7) {
            case 0:
                fc1Var.h1 = null;
                fc1Var.e1 = 1.0f;
                fc1Var.X0 = 0.0f;
                fc1Var.Y0 = 0.0f;
                fc1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.e2.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new ru0(this, 26), 200L);
                break;
            case 2:
                fc1Var.K0.e();
                fc1Var.Y.setCornerRadius(-1.0f);
                fc1Var.D0 = false;
                fc1Var.Y.b0 = false;
                fc1Var.p0 = fc1Var.o0;
                fc1Var.y();
                break;
            case 3:
                for (org.telegram.ui.Components.l9 l9Var : fc1Var.V) {
                    org.telegram.ui.Components.i5 i5Var = l9Var.e;
                    if (i5Var != null && (z2Var = i5Var.k) != null) {
                        z2Var.t0 = true;
                        z2Var.P0(false);
                    }
                }
                break;
            case 4:
                fc1Var.s();
                for (org.telegram.ui.Components.l9 l9Var2 : fc1Var.V) {
                    org.telegram.ui.Components.i5 i5Var2 = l9Var2.e;
                    if (i5Var2 != null && (z2Var2 = i5Var2.k) != null) {
                        z2Var2.t0 = false;
                        z2Var2.Q0();
                    }
                }
                fc1Var.R.setVisibility(8);
                break;
            case 5:
                fc1Var.E.setText(org.telegram.messenger.id.M0(2131743493, null));
                fc1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (fc1Var.Z.getTag() == null) {
                    fc1Var.Z.setVisibility(8);
                    break;
                }
                break;
            case 7:
                fc1Var.Y.setTranslationX(0.0f);
                fc1Var.Y.setTranslationY(0.0f);
                fc1Var.Y.setScaleY(1.0f);
                fc1Var.Y.setScaleX(1.0f);
                fc1Var.Y.setVisibility(8);
                break;
            case 8:
                fc1Var.D.setVisibility(8);
                break;
            default:
                fc1Var.e0.setVisibility(8);
                break;
        }
    }
}
