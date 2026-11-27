// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tq4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uq4 b;

    public /* synthetic */ tq4(uq4 uq4Var, byte b) {
        this.a = b;
        this.b = uq4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        uq4 uq4Var = this.b;
        switch (b) {
            case 0:
                jn7.f(uq4Var.r.a).j(uq4Var.f);
                uq4Var.requestLayout();
                break;
            default:
                uq4Var.d = null;
                uq4Var.a = null;
                uq4Var.b = false;
                break;
        }
    }
}
