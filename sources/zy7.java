// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zy7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ az7 b;

    public /* synthetic */ zy7(az7 az7Var, byte b) {
        this.a = b;
        this.b = az7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        az7 az7Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) az7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    az7Var.e = null;
                    break;
                }
                break;
            case 1:
                AnimatorSet animatorSet2 = (AnimatorSet) az7Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    az7Var.e = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet3 = (AnimatorSet) az7Var.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    az7Var.e = null;
                    break;
                }
                break;
        }
    }
}
