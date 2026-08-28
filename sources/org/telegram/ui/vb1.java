package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ oc1 e;

    public vb1(oc1 oc1Var, boolean z10, int i9, int i10, boolean z11) {
        this.e = oc1Var;
        this.a = z10;
        this.b = i9;
        this.c = i10;
        this.d = z11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oc1 oc1Var = this.e;
        FrameLayout[] frameLayoutArr = oc1Var.H0;
        oc1Var.n1 = null;
        int i9 = this.c;
        int i10 = this.b;
        boolean z10 = this.a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i9].setVisibility(4);
        }
        int i11 = oc1Var.b;
        if (i11 == 1 || i11 == 2) {
            oc1Var.F0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i9 == 1) {
            frameLayoutArr[i10].setAlpha(0.0f);
        }
    }
}
