package w4;

import android.animation.Animator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
