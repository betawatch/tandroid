// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t41 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u41 b;

    public /* synthetic */ t41(u41 u41Var, byte b) {
        this.a = b;
        this.b = u41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u41 u41Var = this.b;
        switch (b) {
            case 0:
                u41Var.N = false;
                u41Var.e.t(null, false, true);
                break;
            default:
                u41Var.U = 1.0f;
                u41Var.invalidate();
                break;
        }
    }
}
