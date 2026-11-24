// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class za0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb0 b;

    public /* synthetic */ za0(mb0 mb0Var, byte b) {
        this.a = b;
        this.b = mb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mb0 mb0Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                mb0Var.f = false;
                break;
            default:
                mb0Var.m0(false, mb0Var.G ? 1.0f : 0.0f);
                mb0Var.G = false;
                break;
        }
    }
}
