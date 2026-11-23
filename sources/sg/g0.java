package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ g0(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                h0Var.K = null;
                h0Var.f.f(new org.telegram.ui.web.z0(this, 11));
                break;
            default:
                this.b.f.f(new org.telegram.ui.web.z0(this, 12));
                break;
        }
    }
}
