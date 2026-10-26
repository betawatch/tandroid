package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ un d;

    public sl(un unVar, boolean z10, boolean z11, boolean z12) {
        this.d = unVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        un unVar = this.d;
        unVar.Y2 = null;
        unVar.V2.setVisibility(this.a ? 0 : 4);
        unVar.X2.setVisibility(this.b ? 0 : 4);
        unVar.W2.setVisibility(this.c ? 0 : 4);
    }
}
