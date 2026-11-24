// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z22 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ a32 b;

    public z22(a32 a32Var) {
        this.b = a32Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a32 a32Var = this.b;
        switch (b) {
            case 0:
                ((c32) a32Var.d).V.e();
                break;
            default:
                pi4 pi4Var = a32Var.b;
                pi4Var.setAlpha(1.0f);
                d49.w0(pi4Var);
                ((c32) a32Var.d).Y.r.removeView(pi4Var);
                break;
        }
    }

    public z22(a32 a32Var, d49 d49Var) {
        this.b = a32Var;
    }
}
