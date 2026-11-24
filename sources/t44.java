// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t44 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w44 b;

    public /* synthetic */ t44(w44 w44Var, byte b) {
        this.a = b;
        this.b = w44Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        w44 w44Var = this.b;
        switch (b) {
            case 0:
                if (animator == w44Var.c0) {
                    w44Var.c0 = null;
                    break;
                }
                break;
            case 1:
                if (animator == w44Var.d0) {
                    w44Var.d0 = null;
                    break;
                }
                break;
            case 2:
                if (animator == w44Var.R) {
                    w44Var.R = null;
                    w44Var.Q = 0.0f;
                    break;
                }
                break;
            case 3:
                if (animator == w44Var.S) {
                    w44Var.S = null;
                    break;
                }
                break;
            default:
                if (!w44Var.n0) {
                    gm.B2(w44Var.J);
                    w44Var.J = null;
                    break;
                }
                break;
        }
    }
}
