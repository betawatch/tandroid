package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
            Object z10 = hg.k0.z(1, h4Var.d0);
            h4Var.O0.T(h4Var.u0[0].b);
            org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
            q9Var.E0 = h4Var.u0[0].d;
            q9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.u0[1].b();
            h4Var.u0[1].setVisibility(8);
            if (z10 instanceof y2) {
                ((y2) z10).a();
            }
            if (z10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) z10);
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
