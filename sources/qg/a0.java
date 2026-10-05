package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class a0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ a0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f2.setTranslationY(0.0f);
                break;
            default:
                m0 m0Var = this.b;
                m0Var.i2 = false;
                m0Var.f2.setTranslationY(0.0f);
                m0Var.n0();
                break;
        }
    }
}
