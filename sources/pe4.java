// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pe4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ a32 b;

    public pe4(a32 a32Var) {
        this.b = a32Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a32 a32Var = this.b;
        switch (b) {
            case 0:
                ((af4) a32Var.d).m0.e();
                break;
            default:
                pi4 pi4Var = a32Var.b;
                pi4Var.setAlpha(1.0f);
                d49.w0(pi4Var);
                ((af4) a32Var.d).b.removeView(pi4Var);
                break;
        }
    }

    public pe4(a32 a32Var, d49 d49Var) {
        this.b = a32Var;
    }
}
