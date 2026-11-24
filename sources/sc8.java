// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sc8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tc8 b;

    public /* synthetic */ sc8(tc8 tc8Var, byte b) {
        this.a = b;
        this.b = tc8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tc8 tc8Var = this.b;
        switch (b) {
            case 0:
                tc8Var.h = false;
                tc8Var.a = tc8Var.c;
                tc8Var.invalidate();
                int i = tc8Var.K;
                if (i >= 0) {
                    tc8Var.b(i);
                    tc8Var.K = -1;
                    break;
                }
                break;
            default:
                tc8Var.n = false;
                tc8Var.h = false;
                tc8Var.invalidate();
                int i2 = tc8Var.K;
                if (i2 >= 0) {
                    tc8Var.b(i2);
                    tc8Var.K = -1;
                }
                tc8Var.a();
                break;
        }
    }
}
