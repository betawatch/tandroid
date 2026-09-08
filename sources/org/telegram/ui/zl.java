package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class zl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ co d;

    public zl(co coVar, boolean z10, boolean z11, boolean z12) {
        this.d = coVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        co coVar = this.d;
        coVar.M2 = null;
        coVar.J2.setVisibility(this.a ? 0 : 4);
        coVar.L2.setVisibility(this.b ? 0 : 4);
        coVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
