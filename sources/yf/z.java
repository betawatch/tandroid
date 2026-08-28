package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ z(l0 l0Var, int i9) {
        this.a = i9;
        this.b = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b2.setTranslationY(0.0f);
                break;
            default:
                l0 l0Var = this.b;
                l0Var.e2 = false;
                l0Var.b2.setTranslationY(0.0f);
                l0Var.m0();
                break;
        }
    }
}
