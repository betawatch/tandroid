package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                g4Var.u0[1].b();
                g4Var.u0[1].setVisibility(8);
                g4Var.P0.S(g4Var.u0[0].b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                k3[] k3VarArr = g4Var.u0;
                i9Var.z0 = k3VarArr[0].d;
                int i7 = this.b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.u0[i7].setLayerType(0, null);
                g4Var.v0 = null;
                g4Var.f0.f = false;
                break;
            case 1:
                Activity activity = (Activity) this.c;
                int i10 = this.b;
                org.telegram.messenger.g0.t3(activity, i10, false);
                org.telegram.messenger.g0.m3(activity, org.telegram.messenger.g0.B(i10) >= 0.721f);
                break;
            default:
                ((LaunchActivity) this.c).D0(this.b);
                break;
        }
    }
}
