// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class zmc extends AnimatorListenerAdapter {
    public final /* synthetic */ x02 a;
    public final /* synthetic */ lnc b;
    public final /* synthetic */ anc c;

    public zmc(anc ancVar, x02 x02Var, lnc lncVar) {
        this.c = ancVar;
        this.a = x02Var;
        this.b = lncVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            gl.t1(this.b);
        }
    }
}
