// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r43 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ u43 e;

    public r43(u43 u43Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = u43Var;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u43 u43Var = this.e;
        u43Var.G = false;
        if (this.a) {
            return;
        }
        u43Var.d(this.b, this.c, this.d, true);
    }
}
