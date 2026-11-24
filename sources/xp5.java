// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xp5 extends AnimatorListenerAdapter {
    public final /* synthetic */ jf8 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ u11 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ y89 e;
    public final /* synthetic */ yp5 f;

    public xp5(yp5 yp5Var, jf8 jf8Var, float f, u11 u11Var, boolean z, y89 y89Var) {
        this.f = yp5Var;
        this.a = jf8Var;
        this.b = f;
        this.c = u11Var;
        this.d = z;
        this.e = y89Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d99 d99Var;
        yp5 yp5Var = this.f;
        yp5Var.x = null;
        f08 f08Var = new f08(new jf8[]{this.a});
        e99 e99Var = yp5Var.a;
        int currentColor = e99Var.getCurrentColor();
        float f = this.b * 1.0f;
        f08Var.c = currentColor;
        f08Var.d = f;
        u11 u11Var = this.c;
        f08Var.e = u11Var;
        u11Var.getClass();
        int currentColor2 = u11Var instanceof q11 ? -1 : e99Var.getCurrentColor();
        hw7 painting = e99Var.getPainting();
        boolean z = this.d;
        painting.c(f08Var, currentColor2, z, null);
        if (z && (d99Var = e99Var.a) != null) {
            d99Var.Q();
        }
        y89 y89Var = this.e;
        if (y89Var != null) {
            y89Var.run();
        }
    }
}
