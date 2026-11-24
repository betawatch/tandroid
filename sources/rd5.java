// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rd5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ td5 b;

    public /* synthetic */ rd5(td5 td5Var, byte b) {
        this.a = b;
        this.b = td5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        td5 td5Var = this.b;
        switch (b) {
            case 0:
                if (td5Var.c0 == animator) {
                    td5Var.c0 = null;
                    td5Var.b();
                    break;
                }
                break;
            default:
                if (td5Var.b0 == animator) {
                    td5Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                sd5 sd5Var = this.b.a0;
                if (sd5Var != null) {
                    ((u98) sd5Var).a.f0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
