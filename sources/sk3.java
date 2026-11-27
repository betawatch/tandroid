// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tk3 b;

    public /* synthetic */ sk3(tk3 tk3Var, byte b) {
        this.a = b;
        this.b = tk3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tk3 tk3Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = tk3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == tk3Var.e) {
                    tk3Var.e = null;
                    break;
                }
                break;
            default:
                Runnable runnable2 = tk3Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == tk3Var.e) {
                    tk3Var.e = null;
                    break;
                }
                break;
        }
    }
}
