package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ g0(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                i0Var.K = null;
                i0Var.f.f(new q2.d(this, 8));
                break;
            default:
                this.b.f.f(new q2.d(this, 9));
                break;
        }
    }
}
