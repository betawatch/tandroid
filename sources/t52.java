// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t52 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k62 b;

    public /* synthetic */ t52(k62 k62Var, byte b) {
        this.a = b;
        this.b = k62Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        k62 k62Var = this.b;
        switch (b) {
            case 0:
                k62Var.F.setTranslationY(0.0f);
                break;
            case 1:
                k62Var.F.setTranslationY(0.0f);
                break;
            default:
                k62Var.g1 = false;
                k62Var.F.setTranslationY(0.0f);
                k62Var.a0();
                break;
        }
    }
}
