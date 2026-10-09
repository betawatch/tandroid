package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class n3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ n3(p3 p3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.d0 = false;
                break;
            case 1:
                this.b.d0 = false;
                break;
            case 2:
                this.b.N.setVisibility(4);
                break;
            case 3:
                p3 p3Var = this.b;
                p3Var.s0 = p3Var.r0;
                p3Var.d(p3Var.U);
                break;
            default:
                p3 p3Var2 = this.b;
                p3Var2.t0 = 1.0f;
                p3Var2.b.setScaleX(1.0f);
                p3Var2.b.setScaleY(p3Var2.t0);
                p3Var2.invalidate();
                break;
        }
    }
}
