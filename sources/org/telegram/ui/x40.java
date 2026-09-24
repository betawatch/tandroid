package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class x40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ x40(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d60 d60Var = this.b;
                d60Var.V.setVisibility(4);
                d60Var.W.setVisibility(4);
                d60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                d60 d60Var2 = this.b;
                d60Var2.h1 = null;
                d60Var2.g1.setColor(d60Var2.T1 == 3 ? -1163700 : -12761513);
                d60Var2.f1.invalidate();
                break;
        }
    }
}
