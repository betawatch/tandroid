// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v68 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x68 b;

    public /* synthetic */ v68(x68 x68Var, byte b) {
        this.a = b;
        this.b = x68Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        x68 x68Var = this.b;
        switch (b) {
            case 0:
                x68Var.s = null;
                break;
            default:
                x68Var.w = null;
                break;
        }
    }
}
