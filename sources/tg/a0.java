package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
