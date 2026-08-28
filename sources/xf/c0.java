package xf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ d0 f;

    public c0(d0 d0Var, u0 u0Var, float f10, m mVar, boolean z10, Runnable runnable) {
        this.f = d0Var;
        this.a = u0Var;
        this.b = f10;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b1 b1Var;
        d0 d0Var = this.f;
        d0Var.x = null;
        r0 r0Var = new r0(new u0[]{this.a});
        c1 c1Var = d0Var.a;
        int currentColor = c1Var.getCurrentColor();
        float f10 = this.b * 1.0f;
        r0Var.c = currentColor;
        r0Var.d = f10;
        m mVar = this.c;
        r0Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : c1Var.getCurrentColor();
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor2, z10, null);
        if (z10 && (b1Var = c1Var.a) != null) {
            b1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
