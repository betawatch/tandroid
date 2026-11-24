// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y98 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z98 b;

    public /* synthetic */ y98(z98 z98Var, byte b) {
        this.a = b;
        this.b = z98Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        z98 z98Var = this.b;
        switch (b) {
            case 0:
                z98Var.a.n.setVisibility(8);
                break;
            default:
                z98Var.a.h.setVisibility(8);
                break;
        }
    }
}
