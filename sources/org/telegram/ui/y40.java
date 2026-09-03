package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ y40(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d60 d60Var = this.b;
                d60Var.S.setVisibility(4);
                d60Var.T.setVisibility(4);
                d60Var.R.setVisibility(4);
                break;
            case 1:
                this.b.e0 = null;
                break;
            default:
                d60 d60Var2 = this.b;
                d60Var2.e1 = null;
                d60Var2.d1.setColor(d60Var2.Q1 == 3 ? -1163700 : -12761513);
                d60Var2.c1.invalidate();
                break;
        }
    }
}
