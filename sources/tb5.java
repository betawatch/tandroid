// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tb5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vb5 b;

    public /* synthetic */ tb5(vb5 vb5Var, byte b) {
        this.a = b;
        this.b = vb5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        vb5 vb5Var = this.b;
        switch (b) {
            case 0:
                if (vb5Var.c0 == animator) {
                    vb5Var.c0 = null;
                    vb5Var.b();
                    break;
                }
                break;
            default:
                if (vb5Var.b0 == animator) {
                    vb5Var.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ub5 ub5Var = this.b.a0;
                if (ub5Var != null) {
                    ((s78) ub5Var).a.f0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
