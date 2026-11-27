// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oy5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wy5 b;

    public /* synthetic */ oy5(wy5 wy5Var, byte b) {
        this.a = b;
        this.b = wy5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wy5 wy5Var = this.b;
        switch (b) {
            case 0:
                wy5Var.T1.setTranslationY(0.0f);
                break;
            default:
                wy5Var.W1 = false;
                wy5Var.T1.setTranslationY(0.0f);
                wy5Var.j0();
                break;
        }
    }
}
