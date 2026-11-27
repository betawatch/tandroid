// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class v10 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j20 b;

    public /* synthetic */ v10(j20 j20Var, byte b) {
        this.a = b;
        this.b = j20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.v2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                j20Var.f2 = false;
                break;
            case 1:
                j20Var.b2.setVisibility(4);
                j20Var.c2.setImageBitmap(null);
                j20Var.f2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
