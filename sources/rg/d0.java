package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ m c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ e0 f;

    public d0(e0 e0Var, u0 u0Var, float f7, m mVar, boolean z10, Runnable runnable) {
        this.f = e0Var;
        this.a = u0Var;
        this.b = f7;
        this.c = mVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b1 b1Var;
        e0 e0Var = this.f;
        e0Var.x = null;
        r0 r0Var = new r0(new u0[]{this.a});
        c1 c1Var = e0Var.a;
        int currentColor = c1Var.getCurrentColor();
        float f7 = this.b * 1.0f;
        r0Var.c = currentColor;
        r0Var.d = f7;
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
