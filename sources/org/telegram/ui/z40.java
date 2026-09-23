package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ z40(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f60 f60Var = this.b;
                f60Var.V.setVisibility(4);
                f60Var.W.setVisibility(4);
                f60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                f60 f60Var2 = this.b;
                f60Var2.h1 = null;
                f60Var2.g1.setColor(f60Var2.T1 == 3 ? -1163700 : -12761513);
                f60Var2.f1.invalidate();
                break;
        }
    }
}
