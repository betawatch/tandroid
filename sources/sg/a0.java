package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                this.b.U1.setTranslationY(0.0f);
                break;
            default:
                m0 m0Var = this.b;
                m0Var.X1 = false;
                m0Var.U1.setTranslationY(0.0f);
                m0Var.l0();
                break;
        }
    }
}
