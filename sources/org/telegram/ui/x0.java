package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l4 a;

    public x0(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.a;
        if (l4Var.c0.f) {
            l4Var.r0[0].setBackgroundDrawable(null);
            p3[] p3VarArr = l4Var.r0;
            p3 p3Var = p3VarArr[1];
            p3VarArr[1] = p3VarArr[0];
            p3VarArr[0] = p3Var;
            l4Var.e0.i();
            l4Var.W0.a(l4Var.r0[0].getBackgroundColor(), true);
            l4Var.X0.a(l4Var.r0[1].getBackgroundColor(), true);
            y3 y3Var = l4Var.H;
            if (y3Var != null) {
                y3Var.m();
            }
            Object g10 = e2.c.g(1, l4Var.a0);
            l4Var.L0.T(l4Var.r0[0].b);
            org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
            m9Var.E0 = l4Var.r0[0].d;
            m9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.r0[1].b();
            l4Var.r0[1].setVisibility(8);
            if (g10 instanceof b3) {
                ((b3) g10).a();
            }
            if (g10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) g10);
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.c0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        l4Var.Q0 = false;
    }
}
