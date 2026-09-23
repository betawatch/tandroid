package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ p0 a;
    public final /* synthetic */ s0 b;

    public r0(s0 s0Var, p0 p0Var) {
        this.b = s0Var;
        this.a = p0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.a;
        p0Var.setLayerType(0, null);
        this.b.d.removeView(p0Var);
    }
}
