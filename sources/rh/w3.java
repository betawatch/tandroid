package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ w3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.g0 = false;
                break;
            case 1:
                this.b.g0 = false;
                break;
            case 2:
                this.b.O.setVisibility(4);
                break;
            case 3:
                y3 y3Var = this.b;
                y3Var.v0 = y3Var.u0;
                y3Var.d(y3Var.a0);
                break;
            default:
                y3 y3Var2 = this.b;
                y3Var2.w0 = 1.0f;
                y3Var2.b.setScaleX(1.0f);
                y3Var2.b.setScaleY(y3Var2.w0);
                y3Var2.invalidate();
                break;
        }
    }
}
