package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class rl extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ sn d;

    public rl(sn snVar, boolean z10, boolean z11, boolean z12) {
        this.d = snVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sn snVar = this.d;
        snVar.Y2 = null;
        snVar.V2.setVisibility(this.a ? 0 : 4);
        snVar.X2.setVisibility(this.b ? 0 : 4);
        snVar.W2.setVisibility(this.c ? 0 : 4);
    }
}
