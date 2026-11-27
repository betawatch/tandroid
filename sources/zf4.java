// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zf4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fg4 b;

    public /* synthetic */ zf4(fg4 fg4Var, byte b) {
        this.a = b;
        this.b = fg4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        fg4 fg4Var = this.b;
        switch (b) {
            case 0:
                if (fg4Var.D0 == animator) {
                    fg4Var.D0 = null;
                    break;
                }
                break;
            default:
                fg4Var.W = fg4Var.e0;
                fg4Var.d0 = fg4Var.h0;
                fg4Var.a0 = fg4Var.f0;
                fg4Var.b0 = fg4Var.g0;
                fg4Var.e0 = -1;
                fg4Var.f0 = -1;
                fg4Var.g0 = -1;
                fg4Var.h0 = -1;
                break;
        }
    }
}
