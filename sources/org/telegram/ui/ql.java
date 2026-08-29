package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ql extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ tn d;

    public ql(tn tnVar, boolean z10, boolean z11, boolean z12) {
        this.d = tnVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        tn tnVar = this.d;
        tnVar.I2 = null;
        tnVar.F2.setVisibility(this.a ? 0 : 4);
        tnVar.H2.setVisibility(this.b ? 0 : 4);
        tnVar.G2.setVisibility(this.c ? 0 : 4);
    }
}
