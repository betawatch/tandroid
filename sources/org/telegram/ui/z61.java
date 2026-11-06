package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u71 b;

    public /* synthetic */ z61(u71 u71Var, int i7) {
        this.a = i7;
        this.b = u71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                u71 u71Var = this.b;
                u71Var.y0.invalidate();
                u71Var.x0[1].setVisibility(8);
                u71Var.d2 = null;
                break;
            case 1:
                this.b.C0 = null;
                break;
            case 2:
                u71 u71Var2 = this.b;
                if (u71Var2.E0.getTag() == null) {
                    u71Var2.E0.setVisibility(4);
                }
                u71Var2.I0 = null;
                break;
            case 3:
                u71 u71Var3 = this.b;
                if (u71Var3.F0.getTag() == null) {
                    u71Var3.F0.setVisibility(4);
                }
                u71Var3.J0 = null;
                break;
            case 4:
                u71 u71Var4 = this.b;
                cc ccVar = u71Var4.i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) u71Var4.i2.getParent()).removeView(u71Var4.i2);
                    }
                    u71Var4.i2 = null;
                }
                u71Var4.k2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                u71 u71Var5 = this.b;
                if (!u71Var5.q1.a()) {
                    u71Var5.S1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
