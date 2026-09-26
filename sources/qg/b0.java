package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ b0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f2.setTranslationY(0.0f);
                break;
            default:
                n0 n0Var = this.b;
                n0Var.i2 = false;
                n0Var.f2.setTranslationY(0.0f);
                n0Var.n0();
                break;
        }
    }
}
