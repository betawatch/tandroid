package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ m1 c;
    public final /* synthetic */ m2 d;

    public c2(m2 m2Var, int i10, int i11, m1 m1Var) {
        this.d = m2Var;
        this.a = i10;
        this.b = i11;
        this.c = m1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.b.f(1.0f, this.a, this.b);
        m2 m2Var = this.d;
        m2Var.R = f7;
        m2Var.l();
        l2 l2Var = m2Var.f;
        l2Var.invalidate();
        j2 j2Var = m2Var.X;
        j2Var.setBackgroundColor(m2Var.R);
        m1 m1Var = this.c;
        m1Var.b(j2Var, 1.0f);
        m2Var.a = m1Var.a(t6.wj);
        l2Var.invalidate();
    }
}
