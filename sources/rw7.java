// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rw7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i49 b;

    public /* synthetic */ rw7(i49 i49Var, byte b) {
        this.a = b;
        this.b = i49Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i49 i49Var = this.b;
        switch (b) {
            case 0:
                hl.B2(i49Var);
                break;
            case 1:
                super.onAnimationEnd(animator);
                i49Var.M0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                i49Var.R = null;
                i49Var.o0 = 0.0f;
                i49Var.m0 = null;
                i49Var.invalidate();
                break;
        }
    }
}
