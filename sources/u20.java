// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u20 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;

    public /* synthetic */ u20(i30 i30Var, byte b) {
        this.a = b;
        this.b = i30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.v2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                i30Var.f2 = false;
                break;
            case 1:
                i30Var.b2.setVisibility(4);
                i30Var.c2.setImageBitmap(null);
                i30Var.f2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
