package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class j4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ j4(a5 a5Var, int i10) {
        this.a = i10;
        this.b = a5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b;
                a5Var.Y1 = 0.0f;
                a5Var.W1.setAlpha(1.0f);
                a5Var.W1.setVisibility(8);
                a5Var.W1.n();
                break;
            case 1:
                this.b.m2.setTranslationY(0.0f);
                break;
            default:
                a5 a5Var2 = this.b;
                a5Var2.p2 = false;
                a5Var2.m2.setTranslationY(0.0f);
                a5Var2.w0();
                break;
        }
    }
}
