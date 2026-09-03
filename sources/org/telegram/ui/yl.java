package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zn d;

    public yl(zn znVar, boolean z4, boolean z10, boolean z11) {
        this.d = znVar;
        this.a = z4;
        this.b = z10;
        this.c = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zn znVar = this.d;
        znVar.J2 = null;
        znVar.G2.setVisibility(this.a ? 0 : 4);
        znVar.I2.setVisibility(this.b ? 0 : 4);
        znVar.H2.setVisibility(this.c ? 0 : 4);
    }
}
