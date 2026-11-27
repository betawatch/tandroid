// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
