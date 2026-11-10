package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xp b;

    public rz(xp xpVar) {
        this.b = xpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((b00) this.b.d).l0.e();
                break;
            default:
                xp xpVar = this.b;
                View view = xpVar.b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((b00) xpVar.d).b.removeView(view);
                break;
        }
    }

    public rz(xp xpVar, v4.n0 n0Var) {
        this.b = xpVar;
    }
}
