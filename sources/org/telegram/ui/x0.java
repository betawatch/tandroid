package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ l4 a;

    public x0(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.a;
        x3 x3Var = l4Var.K;
        if (l4Var.f0.e) {
            l4Var.u0[0].setBackgroundDrawable(null);
            o3[] o3VarArr = l4Var.u0;
            o3 o3Var = o3VarArr[1];
            o3VarArr[1] = o3VarArr[0];
            o3VarArr[0] = o3Var;
            l4Var.h0.i();
            l4Var.Z0.a(l4Var.u0[0].getBackgroundColor(), true);
            l4Var.a1.a(l4Var.u0[1].getBackgroundColor(), true);
            if (x3Var != null) {
                x3Var.m();
            }
            Object z10 = i0.a.z(1, l4Var.d0);
            l4Var.O0.S(l4Var.u0[0].b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
            n9Var.z0 = l4Var.u0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.u0[1].b();
            l4Var.u0[1].setVisibility(8);
            if (z10 instanceof b3) {
                ((b3) z10).a();
            }
            if (z10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) z10);
            }
        } else if (x3Var != null) {
            x3Var.release();
            l4Var.s();
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        l4Var.T0 = false;
    }
}
