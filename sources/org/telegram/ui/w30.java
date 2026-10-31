package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b50 b;

    public /* synthetic */ w30(b50 b50Var, int i10) {
        this.a = i10;
        this.b = b50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b50 b50Var = this.b;
                b50Var.M1.setVisibility(4);
                b50Var.N1.setVisibility(4);
                b50Var.L1.setVisibility(4);
                break;
            case 1:
                this.b.Y1 = null;
                break;
            default:
                b50 b50Var2 = this.b;
                b50Var2.Y2 = null;
                b50Var2.X2.setColor(b50Var2.K3 == 3 ? -1163700 : -12761513);
                b50Var2.W2.invalidate();
                break;
        }
    }
}
