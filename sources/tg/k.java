package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ k(n nVar, int i10) {
        this.a = i10;
        this.b = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                n nVar = this.b;
                nVar.b.d = 0.0f;
                nVar.d0 = null;
                nVar.j(nVar.L);
                break;
            case 1:
                super.onAnimationEnd(animator);
                n nVar2 = this.b;
                nVar2.b.d = 0.0f;
                nVar2.d0 = null;
                nVar2.j(nVar2.L);
                break;
            case 2:
                super.onAnimationEnd(animator);
                n nVar3 = this.b;
                nVar3.b.d = 0.0f;
                nVar3.d0 = null;
                nVar3.j(nVar3.L);
                break;
            default:
                super.onAnimationEnd(animator);
                n nVar4 = this.b;
                nVar4.b.d = 0.0f;
                nVar4.d0 = null;
                nVar4.j(nVar4.L);
                break;
        }
    }
}
