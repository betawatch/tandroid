package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ q0 a;
    public final /* synthetic */ t0 b;

    public s0(t0 t0Var, q0 q0Var) {
        this.b = t0Var;
        this.a = q0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q0 q0Var = this.a;
        q0Var.setLayerType(0, null);
        this.b.d.removeView(q0Var);
    }
}
