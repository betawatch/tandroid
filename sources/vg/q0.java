package vg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ r0 b;

    public q0(r0 r0Var, o0 o0Var) {
        this.b = r0Var;
        this.a = o0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o0 o0Var = this.a;
        o0Var.setLayerType(0, null);
        this.b.d.removeView(o0Var);
    }
}
