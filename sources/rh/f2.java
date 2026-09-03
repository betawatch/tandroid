package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ o1 c;
    public final /* synthetic */ p2 d;

    public f2(p2 p2Var, int i10, int i11, o1 o1Var) {
        this.d = p2Var;
        this.a = i10;
        this.b = i11;
        this.c = o1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.a, this.b);
        p2 p2Var = this.d;
        p2Var.N = d;
        p2Var.h();
        o2 o2Var = p2Var.e;
        o2Var.invalidate();
        m2 m2Var = p2Var.T;
        m2Var.setBackgroundColor(p2Var.N);
        o1 o1Var = this.c;
        o1Var.b(m2Var, 1.0f);
        p2Var.a = o1Var.a(j6.Ii);
        o2Var.invalidate();
    }
}
