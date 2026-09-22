package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ c0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f2.setTranslationY(0.0f);
                break;
            default:
                p0 p0Var = this.b;
                p0Var.i2 = false;
                p0Var.f2.setTranslationY(0.0f);
                p0Var.n0();
                break;
        }
    }
}
