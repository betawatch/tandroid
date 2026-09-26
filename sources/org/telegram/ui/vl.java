package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wn d;

    public vl(wn wnVar, boolean z10, boolean z11, boolean z12) {
        this.d = wnVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wn wnVar = this.d;
        wnVar.M2 = null;
        wnVar.J2.setVisibility(this.a ? 0 : 4);
        wnVar.L2.setVisibility(this.b ? 0 : 4);
        wnVar.K2.setVisibility(this.c ? 0 : 4);
    }
}
