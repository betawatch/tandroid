// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qm8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ um8 b;

    public /* synthetic */ qm8(um8 um8Var, byte b) {
        this.a = b;
        this.b = um8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        um8 um8Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (um8Var.getParent() != null) {
                    ((ViewGroup) um8Var.getParent()).removeView(um8Var);
                    break;
                }
                break;
            case 1:
                if (um8Var.getParent() != null) {
                    ((ViewGroup) um8Var.getParent()).removeView(um8Var);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                if (um8Var.getParent() != null) {
                    ((ViewGroup) um8Var.getParent()).removeView(um8Var);
                    break;
                }
                break;
        }
    }
}
