// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sv8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv8 b;

    public /* synthetic */ sv8(tv8 tv8Var, byte b) {
        this.a = b;
        this.b = tv8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        tv8 tv8Var = this.b;
        switch (b) {
            case 1:
                AnimatorSet animatorSet = tv8Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    tv8Var.s = null;
                    tv8Var.getClass();
                    break;
                }
                break;
            case 2:
                AnimatorSet animatorSet2 = tv8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tv8Var.s = null;
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
        tv8 tv8Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = tv8Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    tv8Var.h = null;
                }
                nm7.e().k(100, 512);
                break;
            case 1:
                AnimatorSet animatorSet2 = tv8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tv8Var.s = null;
                    if (tv8Var.x) {
                        tv8Var.setLayerType(0, null);
                    }
                }
                nm7.e().k(100, 512);
                break;
            default:
                AnimatorSet animatorSet3 = tv8Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    tv8Var.s = null;
                    gm.c3(new pp8(this, (byte) 10));
                }
                nm7.e().k(100, 512);
                break;
        }
    }
}
