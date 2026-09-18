package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class v0 extends AnimatorListenerAdapter {
    public final /* synthetic */ h4 a;

    public v0(h4 h4Var) {
        this.a = h4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.a;
        if (h4Var.f0.f) {
            h4Var.u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.h0.i();
            h4Var.Z0.a(h4Var.u0[0].getBackgroundColor(), true);
            h4Var.a1.a(h4Var.u0[1].getBackgroundColor(), true);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.m();
            }
            Object v = hg.k0.v(1, h4Var.d0);
            h4Var.O0.T(h4Var.u0[0].b);
            org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
            q9Var.E0 = h4Var.u0[0].d;
            q9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.u0[1].b();
            h4Var.u0[1].setVisibility(8);
            if (v instanceof y2) {
                ((y2) v).a();
            }
            if (v instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) v);
            }
        } else {
            h4Var.U();
            h4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
