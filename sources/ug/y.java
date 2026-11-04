package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ y(f0 f0Var, int i3) {
        this.a = i3;
        this.b = f0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.P1.setTranslationY(0.0f);
                break;
            default:
                f0 f0Var = this.b;
                f0Var.S1 = false;
                f0Var.P1.setTranslationY(0.0f);
                f0Var.l0();
                break;
        }
    }
}
