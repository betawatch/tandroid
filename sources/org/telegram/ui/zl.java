package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
