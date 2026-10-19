package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.web.z1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ s0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                t0Var.K = null;
                t0Var.f.f(new z1(this, 4));
                break;
            default:
                this.b.f.f(new z1(this, 5));
                break;
        }
    }
}
