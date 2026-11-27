// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
