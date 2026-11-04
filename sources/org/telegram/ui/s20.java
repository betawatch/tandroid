package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ s20(x30 x30Var, int i3) {
        this.a = i3;
        this.b = x30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x30 x30Var = this.b;
                x30Var.N1.setVisibility(4);
                x30Var.O1.setVisibility(4);
                x30Var.M1.setVisibility(4);
                break;
            case 1:
                this.b.Z1 = null;
                break;
            default:
                x30 x30Var2 = this.b;
                x30Var2.Z2 = null;
                x30Var2.Y2.setColor(x30Var2.L3 == 3 ? -1163700 : -12761513);
                x30Var2.X2.invalidate();
                break;
        }
    }
}
