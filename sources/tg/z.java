package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ z(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.P1.setTranslationY(0.0f);
                break;
            default:
                g0 g0Var = this.b;
                g0Var.S1 = false;
                g0Var.P1.setTranslationY(0.0f);
                g0Var.l0();
                break;
        }
    }
}
