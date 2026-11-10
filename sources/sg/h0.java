package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.p5;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ h0(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.K = null;
                j0Var.f.f(new p5(this, 26));
                break;
            default:
                this.b.f.f(new p5(this, 27));
                break;
        }
    }
}
