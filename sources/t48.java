// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t48 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v48 b;

    public /* synthetic */ t48(v48 v48Var, byte b) {
        this.a = b;
        this.b = v48Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v48 v48Var = this.b;
        switch (b) {
            case 0:
                v48Var.s = null;
                break;
            default:
                v48Var.w = null;
                break;
        }
    }
}
