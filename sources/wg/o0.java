package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o0 extends AnimatorListenerAdapter {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ p0 b;

    public o0(p0 p0Var, n0 n0Var) {
        this.b = p0Var;
        this.a = n0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.a;
        n0Var.setLayerType(0, null);
        this.b.d.removeView(n0Var);
    }
}
