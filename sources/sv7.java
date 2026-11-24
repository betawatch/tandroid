// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sv7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv7 b;

    public /* synthetic */ sv7(tv7 tv7Var, byte b) {
        this.a = b;
        this.b = tv7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tv7 tv7Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) tv7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    tv7Var.e = null;
                    break;
                }
                break;
            case 1:
                AnimatorSet animatorSet2 = (AnimatorSet) tv7Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tv7Var.e = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet3 = (AnimatorSet) tv7Var.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    tv7Var.e = null;
                    break;
                }
                break;
        }
    }
}
