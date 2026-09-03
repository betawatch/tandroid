package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ k4(c5 c5Var, int i10) {
        this.a = i10;
        this.b = c5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c5 c5Var = this.b;
                c5Var.Y1 = 0.0f;
                c5Var.W1.setAlpha(1.0f);
                c5Var.W1.setVisibility(8);
                c5Var.W1.n();
                break;
            case 1:
                this.b.m2.setTranslationY(0.0f);
                break;
            default:
                c5 c5Var2 = this.b;
                c5Var2.p2 = false;
                c5Var2.m2.setTranslationY(0.0f);
                c5Var2.w0();
                break;
        }
    }
}
