package vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ p3(b4 b4Var, int i10) {
        this.a = i10;
        this.b = b4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.K1 = 0.0f;
                b4Var.I1.setAlpha(1.0f);
                b4Var.I1.setVisibility(8);
                b4Var.I1.n();
                break;
            case 1:
                this.b.Y1.setTranslationY(0.0f);
                break;
            default:
                b4 b4Var2 = this.b;
                b4Var2.b2 = false;
                b4Var2.Y1.setTranslationY(0.0f);
                b4Var2.t0();
                break;
        }
    }
}
