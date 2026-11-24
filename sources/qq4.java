// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qq4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rq4 b;

    public /* synthetic */ qq4(rq4 rq4Var, byte b) {
        this.a = b;
        this.b = rq4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rq4 rq4Var = this.b;
        switch (b) {
            case 0:
                nm7.f(rq4Var.r.a).j(rq4Var.f);
                rq4Var.requestLayout();
                break;
            default:
                rq4Var.d = null;
                rq4Var.a = null;
                rq4Var.b = false;
                break;
        }
    }
}
