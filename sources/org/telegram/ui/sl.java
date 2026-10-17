package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class sl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ sn d;

    public sl(sn snVar, boolean z10, boolean z11, boolean z12) {
        this.d = snVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sn snVar = this.d;
        snVar.M2 = null;
        snVar.J2.setVisibility(this.a ? 0 : 4);
        snVar.L2.setVisibility(this.b ? 0 : 4);
        snVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
