package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends AnimatorListenerAdapter {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ h c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ w f;

    public v(w wVar, m0 m0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f = wVar;
        this.a = m0Var;
        this.b = f10;
        this.c = hVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t0 t0Var;
        w wVar = this.f;
        wVar.x = null;
        j0 j0Var = new j0(new m0[]{this.a});
        u0 u0Var = wVar.a;
        int currentColor = u0Var.getCurrentColor();
        float f10 = this.b * 1.0f;
        j0Var.c = currentColor;
        j0Var.d = f10;
        h hVar = this.c;
        j0Var.e = hVar;
        hVar.getClass();
        int currentColor2 = hVar instanceof d ? -1 : u0Var.getCurrentColor();
        i0 painting = u0Var.getPainting();
        boolean z10 = this.d;
        painting.c(j0Var, currentColor2, z10, null);
        if (z10 && (t0Var = u0Var.a) != null) {
            t0Var.N();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
