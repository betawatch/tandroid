package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ul extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wn d;

    public ul(wn wnVar, boolean z10, boolean z11, boolean z12) {
        this.d = wnVar;
        this.a = z10;
        this.b = z11;
        this.c = z12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wn wnVar = this.d;
        wnVar.Y2 = null;
        wnVar.V2.setVisibility(this.a ? 0 : 4);
        wnVar.X2.setVisibility(this.b ? 0 : 4);
        wnVar.W2.setVisibility(this.c ? 0 : 4);
    }
}
