// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xnb extends AnimatorListenerAdapter {
    public final /* synthetic */ rob a;

    public xnb(rob robVar) {
        this.a = robVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rob robVar = this.a;
        robVar.L0[robVar.Y0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
