package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ z(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O1.setTranslationY(0.0f);
                break;
            default:
                g0 g0Var = this.b;
                g0Var.R1 = false;
                g0Var.O1.setTranslationY(0.0f);
                g0Var.l0();
                break;
        }
    }
}
