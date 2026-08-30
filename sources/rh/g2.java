package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ p1 c;
    public final /* synthetic */ q2 d;

    public g2(q2 q2Var, int i10, int i11, p1 p1Var) {
        this.d = q2Var;
        this.a = i10;
        this.b = i11;
        this.c = p1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        q2 q2Var = this.d;
        q2Var.N = d;
        q2Var.h();
        p2 p2Var = q2Var.e;
        p2Var.invalidate();
        n2 n2Var = q2Var.T;
        n2Var.setBackgroundColor(q2Var.N);
        p1 p1Var = this.c;
        p1Var.b(n2Var, 1.0f);
        q2Var.a = p1Var.a(j6.Ii);
        p2Var.invalidate();
    }
}
