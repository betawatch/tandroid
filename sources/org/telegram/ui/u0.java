package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u0 extends AnimatorListenerAdapter {
    public final /* synthetic */ g4 a;

    public u0(g4 g4Var) {
        this.a = g4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.a;
        t3 t3Var = g4Var.K;
        if (g4Var.f0.e) {
            g4Var.u0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.u0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.h0.i();
            g4Var.a1.a(g4Var.u0[0].getBackgroundColor(), true);
            g4Var.b1.a(g4Var.u0[1].getBackgroundColor(), true);
            if (t3Var != null) {
                t3Var.z();
            }
            Object k10 = org.telegram.ui.Cells.f1.k(1, g4Var.d0);
            g4Var.P0.S(g4Var.u0[0].b);
            org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
            i9Var.z0 = g4Var.u0[0].d;
            i9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.u0[1].b();
            g4Var.u0[1].setVisibility(8);
            if (k10 instanceof x2) {
                ((x2) k10).a();
            }
            if (k10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.w1.o((TLRPC.WebPage) k10);
            }
        } else if (t3Var != null) {
            t3Var.release();
            g4Var.q();
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        g4Var.U0 = false;
    }
}
