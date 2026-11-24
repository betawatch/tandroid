// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zb8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ac8 b;

    public /* synthetic */ zb8(ac8 ac8Var, byte b) {
        this.a = b;
        this.b = ac8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ac8 ac8Var = this.b;
        switch (b) {
            case 0:
                ac8Var.a.n.setVisibility(8);
                break;
            default:
                ac8Var.a.h.setVisibility(8);
                break;
        }
    }
}
