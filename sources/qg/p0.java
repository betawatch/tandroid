package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class p0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ p0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.K = null;
                q0Var.f.f(new org.telegram.ui.web.b(this, 12));
                break;
            default:
                this.b.f.f(new org.telegram.ui.web.b(this, 13));
                break;
        }
    }
}
