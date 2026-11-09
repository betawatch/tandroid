package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xp b;

    public qz(xp xpVar) {
        this.b = xpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((a00) this.b.d).l0.e();
                break;
            default:
                xp xpVar = this.b;
                View view = xpVar.b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((a00) xpVar.d).b.removeView(view);
                break;
        }
    }

    public qz(xp xpVar, v4.n0 n0Var) {
        this.b = xpVar;
    }
}
