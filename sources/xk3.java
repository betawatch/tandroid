// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f89 b;
    public final /* synthetic */ of3 c;
    public final /* synthetic */ sh3 d;

    public /* synthetic */ xk3(sh3 sh3Var, f89 f89Var, of3 of3Var, byte b) {
        this.a = b;
        this.d = sh3Var;
        this.b = f89Var;
        this.c = of3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f89 f89Var = this.b;
        sh3 sh3Var = this.d;
        of3 of3Var = this.c;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                of3Var.setClipProgress(0.0f);
                of3Var.setElevation(0.0f);
                sh3Var.d(f89Var);
                sh3Var.x.remove(f89Var);
                sh3Var.A();
                break;
            default:
                animator.removeAllListeners();
                of3Var.setClipProgress(0.0f);
                of3Var.setElevation(0.0f);
                sh3Var.d(f89Var);
                sh3Var.x.remove(f89Var);
                sh3Var.A();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        sh3 sh3Var = this.d;
        switch (b) {
            case 0:
                sh3Var.y();
                break;
            default:
                sh3Var.y();
                break;
        }
    }
}
