// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class sw7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx7 b;

    public /* synthetic */ sw7(dx7 dx7Var, byte b) {
        this.a = b;
        this.b = dx7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.L1 = 0.0f;
                dx7Var.J1.setAlpha(1.0f);
                dx7Var.J1.setVisibility(8);
                dx7Var.J1.k();
                break;
            case 1:
                dx7Var.d2.setTranslationY(0.0f);
                break;
            default:
                dx7Var.g2 = false;
                dx7Var.d2.setTranslationY(0.0f);
                dx7Var.t0();
                break;
        }
    }
}
