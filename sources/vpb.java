// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vpb extends AnimatorListenerAdapter {
    public final /* synthetic */ pqb a;

    public vpb(pqb pqbVar) {
        this.a = pqbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pqb pqbVar = this.a;
        pqbVar.L0[pqbVar.Y0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
