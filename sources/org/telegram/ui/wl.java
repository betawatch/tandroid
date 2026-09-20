package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zn d;

    public wl(zn znVar, boolean z10, boolean z11, boolean z12) {
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
