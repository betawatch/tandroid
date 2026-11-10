package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc1 b;

    public /* synthetic */ zb1(jc1 jc1Var, int i7) {
        this.a = i7;
        this.b = jc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        di.z2 z2Var;
        di.z2 z2Var2;
        int i7 = this.a;
        jc1 jc1Var = this.b;
        switch (i7) {
            case 0:
                jc1Var.h1 = null;
                jc1Var.e1 = 1.0f;
                jc1Var.X0 = 0.0f;
                jc1Var.Y0 = 0.0f;
                jc1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.e2.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new uu0(this, 26), 200L);
                break;
            case 2:
                jc1Var.K0.e();
                jc1Var.Y.setCornerRadius(-1.0f);
                jc1Var.D0 = false;
                jc1Var.Y.b0 = false;
                jc1Var.p0 = jc1Var.o0;
                jc1Var.y();
                break;
            case 3:
                for (org.telegram.ui.Components.k9 k9Var : jc1Var.V) {
                    org.telegram.ui.Components.h5 h5Var = k9Var.e;
                    if (h5Var != null && (z2Var = h5Var.k) != null) {
                        z2Var.t0 = true;
                        z2Var.P0(false);
                    }
                }
                break;
            case 4:
                jc1Var.s();
                for (org.telegram.ui.Components.k9 k9Var2 : jc1Var.V) {
                    org.telegram.ui.Components.h5 h5Var2 = k9Var2.e;
                    if (h5Var2 != null && (z2Var2 = h5Var2.k) != null) {
                        z2Var2.t0 = false;
                        z2Var2.Q0();
                    }
                }
                jc1Var.R.setVisibility(8);
                break;
            case 5:
                jc1Var.E.setText(org.telegram.messenger.id.M0(2131743490, null));
                jc1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (jc1Var.Z.getTag() == null) {
                    jc1Var.Z.setVisibility(8);
                    break;
                }
                break;
            case 7:
                jc1Var.Y.setTranslationX(0.0f);
                jc1Var.Y.setTranslationY(0.0f);
                jc1Var.Y.setScaleY(1.0f);
                jc1Var.Y.setScaleX(1.0f);
                jc1Var.Y.setVisibility(8);
                break;
            case 8:
                jc1Var.D.setVisibility(8);
                break;
            default:
                jc1Var.e0.setVisibility(8);
                break;
        }
    }
}
