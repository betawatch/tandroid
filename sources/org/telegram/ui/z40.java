package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ z40(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e60 e60Var = this.b;
                e60Var.S.setVisibility(4);
                e60Var.T.setVisibility(4);
                e60Var.R.setVisibility(4);
                break;
            case 1:
                this.b.e0 = null;
                break;
            default:
                e60 e60Var2 = this.b;
                e60Var2.e1 = null;
                e60Var2.d1.setColor(e60Var2.Q1 == 3 ? -1163700 : -12761513);
                e60Var2.c1.invalidate();
                break;
        }
    }
}
