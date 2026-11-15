package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ n0 b;

    public m0(n0 n0Var, l0 l0Var) {
        this.b = n0Var;
        this.a = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.a;
        l0Var.setLayerType(0, null);
        this.b.d.removeView(l0Var);
    }
}
