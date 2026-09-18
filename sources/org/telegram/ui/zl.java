package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bo d;

    public zl(bo boVar, boolean z10, boolean z11, boolean z12) {
        this.d = boVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bo boVar = this.d;
        boVar.M2 = null;
        boVar.J2.setVisibility(this.a ? 0 : 4);
        boVar.L2.setVisibility(this.b ? 0 : 4);
        boVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
