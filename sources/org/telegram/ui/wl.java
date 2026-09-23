package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xn d;

    public wl(xn xnVar, boolean z10, boolean z11, boolean z12) {
        this.d = xnVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xn xnVar = this.d;
        xnVar.M2 = null;
        xnVar.J2.setVisibility(this.a ? 0 : 4);
        xnVar.L2.setVisibility(this.b ? 0 : 4);
        xnVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
