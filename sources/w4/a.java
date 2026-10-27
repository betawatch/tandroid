package w4;

import android.animation.Animator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a implements Animator.AnimatorListener {
    public final /* synthetic */ b a;
    public final /* synthetic */ c b;

    public a(c cVar, b bVar) {
        this.b = cVar;
        this.a = bVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        c cVar = this.b;
        b bVar = this.a;
        cVar.a(1.0f, bVar, true);
        bVar.k = bVar.e;
        bVar.l = bVar.f;
        bVar.m = bVar.g;
        bVar.a((bVar.j + 1) % bVar.i.length);
        if (!cVar.f) {
            cVar.e += 1.0f;
            return;
        }
        cVar.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (bVar.n) {
            bVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
