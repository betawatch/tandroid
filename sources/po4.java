// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class po4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qo4 b;

    public /* synthetic */ po4(qo4 qo4Var, byte b) {
        this.a = b;
        this.b = qo4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qo4 qo4Var = this.b;
        switch (b) {
            case 0:
                kk7.f(qo4Var.r.a).j(qo4Var.f);
                qo4Var.requestLayout();
                break;
            default:
                qo4Var.d = null;
                qo4Var.a = null;
                qo4Var.b = false;
                break;
        }
    }
}
