// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y38 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b48 b;

    public /* synthetic */ y38(b48 b48Var, byte b) {
        this.a = b;
        this.b = b48Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        b48 b48Var = this.b;
        switch (b) {
            case 0:
                b48Var.w1 = null;
                break;
            default:
                b48Var.x1 = null;
                break;
        }
    }
}
