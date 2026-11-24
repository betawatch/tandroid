// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vx7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wx7 b;

    public /* synthetic */ vx7(wx7 wx7Var, byte b) {
        this.a = b;
        this.b = wx7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wx7 wx7Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) wx7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wx7Var.e = null;
                    break;
                }
                break;
            case 1:
                AnimatorSet animatorSet2 = (AnimatorSet) wx7Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wx7Var.e = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet3 = (AnimatorSet) wx7Var.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    wx7Var.e = null;
                    break;
                }
                break;
        }
    }
}
