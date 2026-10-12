package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ k4 a;

    public x0(k4 k4Var) {
        this.a = k4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k4 k4Var = this.a;
        x3 x3Var = k4Var.K;
        if (k4Var.f0.e) {
            k4Var.u0[0].setBackgroundDrawable(null);
            o3[] o3VarArr = k4Var.u0;
            o3 o3Var = o3VarArr[1];
            o3VarArr[1] = o3VarArr[0];
            o3VarArr[0] = o3Var;
            k4Var.h0.i();
            k4Var.Z0.a(k4Var.u0[0].getBackgroundColor(), true);
            k4Var.a1.a(k4Var.u0[1].getBackgroundColor(), true);
            if (x3Var != null) {
                x3Var.m();
            }
            Object x10 = i2.d.x(1, k4Var.d0);
            k4Var.O0.S(k4Var.u0[0].b);
            org.telegram.ui.Cells.o9 o9Var = k4Var.O0;
            o9Var.z0 = k4Var.u0[0].d;
            o9Var.f(true);
            k4Var.i0(false);
            k4Var.f0();
            k4Var.u0[1].b();
            k4Var.u0[1].setVisibility(8);
            if (x10 instanceof b3) {
                ((b3) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) x10);
            }
        } else if (x3Var != null) {
            x3Var.release();
            k4Var.s();
        } else {
            k4Var.U();
            k4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        k4Var.T0 = false;
    }
}
