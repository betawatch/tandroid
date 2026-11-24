// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wlb extends AnimatorListenerAdapter {
    public final /* synthetic */ qmb a;

    public wlb(qmb qmbVar) {
        this.a = qmbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qmb qmbVar = this.a;
        qmbVar.L0[qmbVar.Y0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
