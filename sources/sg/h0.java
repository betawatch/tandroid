package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m5;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                j0Var.f.f(new m5(this, 28));
                break;
            default:
                this.b.f.f(new m5(this, 29));
                break;
        }
    }
}
