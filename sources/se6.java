// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class se6 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qh6 b;

    public /* synthetic */ se6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                if (qh6Var.d == animator) {
                    qh6Var.d = null;
                    break;
                }
                break;
            default:
                qh6Var.c.setVisibility(8);
                if (qh6Var.d == animator) {
                    qh6Var.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
