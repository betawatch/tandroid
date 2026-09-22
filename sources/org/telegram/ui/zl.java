package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
