// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s19 extends AnimatorListenerAdapter {
    public final /* synthetic */ r19 a;
    public final /* synthetic */ t19 b;

    public s19(t19 t19Var, r19 r19Var) {
        this.b = t19Var;
        this.a = r19Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r19 r19Var = this.a;
        r19Var.setLayerType(0, null);
        this.b.d.removeView(r19Var);
    }
}
