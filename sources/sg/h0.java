package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.m5;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
