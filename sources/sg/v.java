package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v extends AnimatorListenerAdapter {
    public final /* synthetic */ n0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ h c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Runnable e;
    public final /* synthetic */ w f;

    public v(w wVar, n0 n0Var, float f10, h hVar, boolean z9, Runnable runnable) {
        this.f = wVar;
        this.a = n0Var;
        this.b = f10;
        this.c = hVar;
        this.d = z9;
        this.e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v0 v0Var;
        w wVar = this.f;
        wVar.x = null;
        k0 k0Var = new k0(new n0[]{this.a});
        w0 w0Var = wVar.a;
        int currentColor = w0Var.getCurrentColor();
        float f10 = this.b * 1.0f;
        k0Var.c = currentColor;
        k0Var.d = f10;
        h hVar = this.c;
        k0Var.e = hVar;
        hVar.getClass();
        int currentColor2 = hVar instanceof d ? -1 : w0Var.getCurrentColor();
        j0 painting = w0Var.getPainting();
        boolean z9 = this.d;
        painting.c(k0Var, currentColor2, z9, null);
        if (z9 && (v0Var = w0Var.a) != null) {
            v0Var.Y();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
