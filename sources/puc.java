// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class puc extends AnimatorListenerAdapter {
    public final /* synthetic */ n12 a;
    public final /* synthetic */ yrc b;
    public final /* synthetic */ quc c;

    public puc(quc qucVar, n12 n12Var, yrc yrcVar) {
        this.c = qucVar;
        this.a = n12Var;
        this.b = yrcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            hl.t1(this.b);
        }
    }
}
