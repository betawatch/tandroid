package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ a0(h0 h0Var, int i7) {
        this.a = i7;
        this.b = h0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.P1.setTranslationY(0.0f);
                break;
            default:
                h0 h0Var = this.b;
                h0Var.S1 = false;
                h0Var.P1.setTranslationY(0.0f);
                h0Var.l0();
                break;
        }
    }
}
