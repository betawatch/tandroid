// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y82 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z82 b;

    public /* synthetic */ y82(z82 z82Var, byte b) {
        this.a = b;
        this.b = z82Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        z82 z82Var = this.b;
        switch (b) {
            case 0:
                if (z82Var.R == animator) {
                    z82Var.getSubtitleTextView().setVisibility(4);
                    z82Var.R = null;
                    break;
                }
                break;
            default:
                z82Var.R = null;
                break;
        }
    }
}
