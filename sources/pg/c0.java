package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ v0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ d0 f;

    public c0(d0 d0Var, v0 v0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f = d0Var;
        this.a = v0Var;
        this.b = f7;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c1 c1Var;
        d0 d0Var = this.f;
        d0Var.x = null;
        s0 s0Var = new s0(new v0[]{this.a});
        d1 d1Var = d0Var.a;
        int currentColor = d1Var.getCurrentColor();
        float f7 = this.b * 1.0f;
        s0Var.c = currentColor;
        s0Var.d = f7;
        m mVar = this.c;
        s0Var.e = mVar;
        mVar.getClass();
        int currentColor2 = mVar instanceof d ? -1 : d1Var.getCurrentColor();
        r0 painting = d1Var.getPainting();
        boolean z10 = this.d;
        painting.c(s0Var, currentColor2, z10, null);
        if (z10 && (c1Var = d1Var.a) != null) {
            c1Var.e();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
