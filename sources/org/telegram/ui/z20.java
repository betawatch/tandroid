package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ z20(e40 e40Var, int i7) {
        this.a = i7;
        this.b = e40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                e40Var.Q1.setVisibility(4);
                e40Var.R1.setVisibility(4);
                e40Var.P1.setVisibility(4);
                break;
            case 1:
                this.b.c2 = null;
                break;
            default:
                e40 e40Var2 = this.b;
                e40Var2.c3 = null;
                e40Var2.b3.setColor(e40Var2.S3 == 3 ? -1163700 : -12761513);
                e40Var2.a3.invalidate();
                break;
        }
    }
}
