// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t94 extends AnimatorListenerAdapter {
    public final /* synthetic */ v94 a;

    public t94(v94 v94Var) {
        this.a = v94Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v94 v94Var = this.a;
        if (v94Var.r) {
            v94Var.d.setVisibility(4);
        } else {
            v94Var.e.setVisibility(4);
        }
    }
}
