// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class y33 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ b43 e;

    public y33(b43 b43Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = b43Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b43 b43Var = this.e;
        b43Var.G = false;
        if (this.a) {
            return;
        }
        b43Var.d(this.b, this.c, this.d, true);
    }
}
