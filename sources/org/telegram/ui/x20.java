package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                c40Var.Q1.setVisibility(4);
                c40Var.R1.setVisibility(4);
                c40Var.P1.setVisibility(4);
                break;
            case 1:
                this.b.c2 = null;
                break;
            default:
                c40 c40Var2 = this.b;
                c40Var2.c3 = null;
                c40Var2.b3.setColor(c40Var2.S3 == 3 ? -1163700 : -12761513);
                c40Var2.a3.invalidate();
                break;
        }
    }
}
