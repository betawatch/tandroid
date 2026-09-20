package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class u0 extends AnimatorListenerAdapter {
    public final /* synthetic */ h4 a;

    public u0(h4 h4Var) {
        this.a = h4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.a;
        u3 u3Var = h4Var.K;
        if (h4Var.f0.e) {
            h4Var.u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.h0.i();
            h4Var.Z0.a(h4Var.u0[0].getBackgroundColor(), true);
            h4Var.a1.a(h4Var.u0[1].getBackgroundColor(), true);
            if (u3Var != null) {
                u3Var.m();
            }
            Object x10 = hg.k0.x(1, h4Var.d0);
            h4Var.O0.T(h4Var.u0[0].b);
            org.telegram.ui.Cells.r9 r9Var = h4Var.O0;
            r9Var.E0 = h4Var.u0[0].d;
            r9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.u0[1].b();
            h4Var.u0[1].setVisibility(8);
            if (x10 instanceof y2) {
                ((y2) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) x10);
            }
        } else if (u3Var != null) {
            u3Var.release();
            h4Var.s();
        } else {
            h4Var.U();
            h4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
