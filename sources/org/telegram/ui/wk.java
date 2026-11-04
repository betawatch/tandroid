package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wk extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wm d;

    public wk(wm wmVar, boolean z10, boolean z11, boolean z12) {
        this.d = wmVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wm wmVar = this.d;
        wmVar.b3 = null;
        wmVar.Y2.setVisibility(this.a ? 0 : 4);
        wmVar.a3.setVisibility(this.b ? 0 : 4);
        wmVar.Z2.setVisibility(this.c ? 0 : 4);
    }
}
