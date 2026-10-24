package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class d0 extends AnimatorListenerAdapter {
    public final /* synthetic */ w0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ e0 f;

    public d0(e0 e0Var, w0 w0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f = e0Var;
        this.a = w0Var;
        this.b = f7;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d1 d1Var;
        e0 e0Var = this.f;
        e0Var.x = null;
        t0 t0Var = new t0(new w0[]{this.a});
        e1 e1Var = e0Var.a;
        int currentColor = e1Var.getCurrentColor();
        float f7 = this.b * 1.0f;
        t0Var.c = currentColor;
        t0Var.d = f7;
        m mVar = this.c;
        t0Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : e1Var.getCurrentColor();
        s0 painting = e1Var.getPainting();
        boolean z10 = this.d;
        painting.c(t0Var, currentColor2, z10, null);
        if (z10 && (d1Var = e1Var.a) != null) {
            d1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
