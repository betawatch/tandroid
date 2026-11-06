package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ x20(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c40 c40Var = this.b;
                c40Var.M1.setVisibility(4);
                c40Var.N1.setVisibility(4);
                c40Var.L1.setVisibility(4);
                break;
            case 1:
                this.b.Y1 = null;
                break;
            default:
                c40 c40Var2 = this.b;
                c40Var2.Y2 = null;
                c40Var2.X2.setColor(c40Var2.K3 == 3 ? -1163700 : -12761513);
                c40Var2.W2.invalidate();
                break;
        }
    }
}
