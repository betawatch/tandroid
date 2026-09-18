package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                p0Var.m0();
                break;
        }
    }
}
