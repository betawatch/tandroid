package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.a2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ r0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                s0Var.K = null;
                s0Var.f.f(new a2(this, 4));
                break;
            default:
                this.b.f.f(new a2(this, 5));
                break;
        }
    }
}
