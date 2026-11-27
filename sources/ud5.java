// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ud5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wd5 b;

    public /* synthetic */ ud5(wd5 wd5Var, byte b) {
        this.a = b;
        this.b = wd5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wd5 wd5Var = this.b;
        switch (b) {
            case 0:
                if (wd5Var.c0 == animator) {
                    wd5Var.c0 = null;
                    wd5Var.b();
                    break;
                }
                break;
            default:
                if (wd5Var.b0 == animator) {
                    wd5Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                vd5 vd5Var = this.b.a0;
                if (vd5Var != null) {
                    ((jb8) vd5Var).a.f0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
