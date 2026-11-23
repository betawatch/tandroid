package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u extends AnimatorListenerAdapter {
    public final /* synthetic */ l0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ h c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ v f;

    public u(v vVar, l0 l0Var, float f10, h hVar, boolean z10, Runnable runnable) {
        this.f = vVar;
        this.a = l0Var;
        this.b = f10;
        this.c = hVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s0 s0Var;
        v vVar = this.f;
        vVar.x = null;
        i0 i0Var = new i0(new l0[]{this.a});
        t0 t0Var = vVar.a;
        int currentColor = t0Var.getCurrentColor();
        float f10 = this.b * 1.0f;
        i0Var.c = currentColor;
        i0Var.d = f10;
        h hVar = this.c;
        i0Var.e = hVar;
        hVar.getClass();
        int currentColor2 = hVar instanceof d ? -1 : t0Var.getCurrentColor();
        h0 painting = t0Var.getPainting();
        boolean z10 = this.d;
        painting.c(i0Var, currentColor2, z10, null);
        if (z10 && (s0Var = t0Var.a) != null) {
            s0Var.k0();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
