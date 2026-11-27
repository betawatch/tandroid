// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wpb extends AnimatorListenerAdapter {
    public final /* synthetic */ pqb a;

    public wpb(pqb pqbVar) {
        this.a = pqbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pqb pqbVar = this.a;
        if (pqbVar.Y0 == null) {
            pqbVar.L0[0].setVisibility(4);
        }
    }
}
