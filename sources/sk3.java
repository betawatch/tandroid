// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
