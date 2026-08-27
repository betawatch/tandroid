package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ d0 f;

    public c0(d0 d0Var, t0 t0Var, float f10, m mVar, boolean z10, Runnable runnable) {
        this.f = d0Var;
        this.a = t0Var;
        this.b = f10;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a1 a1Var;
        d0 d0Var = this.f;
        d0Var.x = null;
        q0 q0Var = new q0(new t0[]{this.a});
        b1 b1Var = d0Var.a;
        int currentColor = b1Var.getCurrentColor();
        float f10 = this.b * 1.0f;
        q0Var.c = currentColor;
        q0Var.d = f10;
        m mVar = this.c;
        q0Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : b1Var.getCurrentColor();
        p0 painting = b1Var.getPainting();
        boolean z10 = this.d;
        painting.c(q0Var, currentColor2, z10, null);
        if (z10 && (a1Var = b1Var.a) != null) {
            a1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
