package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class d0 extends AnimatorListenerAdapter {
    public final /* synthetic */ x0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ e0 f;

    public d0(e0 e0Var, x0 x0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f = e0Var;
        this.a = x0Var;
        this.b = f7;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e1 e1Var;
        e0 e0Var = this.f;
        e0Var.x = null;
        u0 u0Var = new u0(new x0[]{this.a});
        f1 f1Var = e0Var.a;
        int currentColor = f1Var.getCurrentColor();
        float f7 = this.b * 1.0f;
        u0Var.c = currentColor;
        u0Var.d = f7;
        m mVar = this.c;
        u0Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : f1Var.getCurrentColor();
        t0 painting = f1Var.getPainting();
        boolean z10 = this.d;
        painting.c(u0Var, currentColor2, z10, null);
        if (z10 && (e1Var = f1Var.a) != null) {
            e1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
