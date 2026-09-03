package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xn d;

    public wl(xn xnVar, boolean z4, boolean z10, boolean z11) {
        this.d = xnVar;
        this.a = z4;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xn xnVar = this.d;
        xnVar.J2 = null;
        xnVar.G2.setVisibility(this.a ? 0 : 4);
        xnVar.I2.setVisibility(this.b ? 0 : 4);
        xnVar.H2.setVisibility(this.c ? 0 : 4);
    }
}
