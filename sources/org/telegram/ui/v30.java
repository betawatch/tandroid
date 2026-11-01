package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a50 b;

    public /* synthetic */ v30(a50 a50Var, int i10) {
        this.a = i10;
        this.b = a50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a50 a50Var = this.b;
                a50Var.M1.setVisibility(4);
                a50Var.N1.setVisibility(4);
                a50Var.L1.setVisibility(4);
                break;
            case 1:
                this.b.Y1 = null;
                break;
            default:
                a50 a50Var2 = this.b;
                a50Var2.Y2 = null;
                a50Var2.X2.setColor(a50Var2.K3 == 3 ? -1163700 : -12761513);
                a50Var2.W2.invalidate();
                break;
        }
    }
}
