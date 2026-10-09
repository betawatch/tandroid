package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zn d;

    public zl(zn znVar, boolean z10, boolean z11, boolean z12) {
        this.d = znVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zn znVar = this.d;
        znVar.M2 = null;
        znVar.J2.setVisibility(this.a ? 0 : 4);
        znVar.L2.setVisibility(this.b ? 0 : 4);
        znVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
