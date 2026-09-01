package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class k4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;

    public /* synthetic */ k4(b5 b5Var, int i10) {
        this.a = i10;
        this.b = b5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b5 b5Var = this.b;
                b5Var.Y1 = 0.0f;
                b5Var.W1.setAlpha(1.0f);
                b5Var.W1.setVisibility(8);
                b5Var.W1.n();
                break;
            case 1:
                this.b.m2.setTranslationY(0.0f);
                break;
            default:
                b5 b5Var2 = this.b;
                b5Var2.p2 = false;
                b5Var2.m2.setTranslationY(0.0f);
                b5Var2.w0();
                break;
        }
    }
}
