package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class z20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ z20(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                e40Var.M1.setVisibility(4);
                e40Var.N1.setVisibility(4);
                e40Var.L1.setVisibility(4);
                break;
            case 1:
                this.b.Y1 = null;
                break;
            default:
                e40 e40Var2 = this.b;
                e40Var2.Y2 = null;
                e40Var2.X2.setColor(e40Var2.K3 == 3 ? -1163700 : -12761513);
                e40Var2.W2.invalidate();
                break;
        }
    }
}
