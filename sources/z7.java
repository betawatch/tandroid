// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z7 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ a8 e;

    public z7(a8 a8Var, boolean z, int i, int i2, int i3) {
        this.e = a8Var;
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.a ? 1.0f : 0.0f;
        int i = this.b;
        int i2 = this.c;
        int f2 = on2.f(f, i, i2);
        a8 a8Var = this.e;
        a8Var.setTextColor(f2);
        a8Var.setIconColor(on2.f(f, this.d, i2));
    }
}
