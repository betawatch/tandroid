// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w39 extends AnimatorListenerAdapter {
    public final /* synthetic */ v39 a;
    public final /* synthetic */ x39 b;

    public w39(x39 x39Var, v39 v39Var) {
        this.b = x39Var;
        this.a = v39Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v39 v39Var = this.a;
        v39Var.setLayerType(0, null);
        this.b.d.removeView(v39Var);
    }
}
