package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class vl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yn d;

    public vl(yn ynVar, boolean z10, boolean z11, boolean z12) {
        this.d = ynVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yn ynVar = this.d;
        ynVar.K2 = null;
        ynVar.H2.setVisibility(this.a ? 0 : 4);
        ynVar.J2.setVisibility(this.b ? 0 : 4);
        ynVar.I2.setVisibility(this.c ? 0 : 4);
    }
}
