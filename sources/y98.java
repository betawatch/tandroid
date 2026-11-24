// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y98 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z98 b;

    public /* synthetic */ y98(z98 z98Var, byte b) {
        this.a = b;
        this.b = z98Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        z98 z98Var = this.b;
        switch (b) {
            case 0:
                z98Var.a.n.setVisibility(8);
                break;
            default:
                z98Var.a.h.setVisibility(8);
                break;
        }
    }
}
