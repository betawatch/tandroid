package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t61 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ l71 e;

    public t61(l71 l71Var, boolean z10, int i3, int i10, boolean z11) {
        this.e = l71Var;
        this.a = z10;
        this.b = i3;
        this.c = i10;
        this.d = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l71 l71Var = this.e;
        FrameLayout[] frameLayoutArr = l71Var.N0;
        l71Var.t1 = null;
        int i3 = this.c;
        int i10 = this.b;
        boolean z10 = this.a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i3].setVisibility(4);
        }
        int i11 = l71Var.b;
        if (i11 == 1 || i11 == 2) {
            l71Var.L0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i3 == 1) {
            frameLayoutArr[i10].setAlpha(0.0f);
        }
    }
}
