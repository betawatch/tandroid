// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t48 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v48 b;

    public /* synthetic */ t48(v48 v48Var, byte b) {
        this.a = b;
        this.b = v48Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v48 v48Var = this.b;
        switch (b) {
            case 0:
                v48Var.s = null;
                break;
            default:
                v48Var.w = null;
                break;
        }
    }
}
