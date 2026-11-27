// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class rl4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xl4 b;

    public /* synthetic */ rl4(xl4 xl4Var, byte b) {
        this.a = b;
        this.b = xl4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xl4 xl4Var = this.b;
        switch (b) {
            case 0:
                xl4Var.a.c(false, true);
                break;
            default:
                xl4Var.y = null;
                break;
        }
    }
}
