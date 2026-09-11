package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
