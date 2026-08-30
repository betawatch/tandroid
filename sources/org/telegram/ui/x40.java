package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c60 b;

    public /* synthetic */ x40(c60 c60Var, int i10) {
        this.a = i10;
        this.b = c60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c60 c60Var = this.b;
                c60Var.S.setVisibility(4);
                c60Var.T.setVisibility(4);
                c60Var.R.setVisibility(4);
                break;
            case 1:
                this.b.e0 = null;
                break;
            default:
                c60 c60Var2 = this.b;
                c60Var2.e1 = null;
                c60Var2.d1.setColor(c60Var2.Q1 == 3 ? -1163700 : -12761513);
                c60Var2.c1.invalidate();
                break;
        }
    }
}
