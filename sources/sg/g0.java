package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                i0Var.f.f(new org.telegram.ui.web.z0(this, 11));
                break;
            default:
                this.b.f.f(new org.telegram.ui.web.z0(this, 12));
                break;
        }
    }
}
