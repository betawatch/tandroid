package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l4 a;

    public y0(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.a;
        if (l4Var.b0.f) {
            l4Var.q0[0].setBackgroundDrawable(null);
            p3[] p3VarArr = l4Var.q0;
            p3 p3Var = p3VarArr[1];
            p3VarArr[1] = p3VarArr[0];
            p3VarArr[0] = p3Var;
            l4Var.d0.i();
            l4Var.V0.a(l4Var.q0[0].getBackgroundColor(), true);
            l4Var.W0.a(l4Var.q0[1].getBackgroundColor(), true);
            y3 y3Var = l4Var.G;
            if (y3Var != null) {
                y3Var.m();
            }
            Object k10 = e2.c.k(1, l4Var.Z);
            l4Var.K0.T(l4Var.q0[0].b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
            n9Var.E0 = l4Var.q0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.q0[1].b();
            l4Var.q0[1].setVisibility(8);
            if (k10 instanceof c3) {
                ((c3) k10).a();
            }
            if (k10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.d2.o((TLRPC.WebPage) k10);
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.b0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        l4Var.P0 = false;
    }
}
