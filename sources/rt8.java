// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rt8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ st8 b;

    public /* synthetic */ rt8(st8 st8Var, byte b) {
        this.a = b;
        this.b = st8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        st8 st8Var = this.b;
        switch (b) {
            case 1:
                AnimatorSet animatorSet = st8Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    st8Var.s = null;
                    st8Var.getClass();
                    break;
                }
                break;
            case 2:
                AnimatorSet animatorSet2 = st8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    st8Var.s = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        st8 st8Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = st8Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    st8Var.h = null;
                }
                kk7.e().k(99, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = st8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    st8Var.s = null;
                    if (st8Var.x) {
                        st8Var.setLayerType(0, null);
                    }
                }
                kk7.e().k(99, 512);
                break;
            default:
                AnimatorSet animatorSet3 = st8Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    st8Var.s = null;
                    gl.d3(new sr8(this, (byte) 2));
                }
                kk7.e().k(99, 512);
                break;
        }
    }
}
