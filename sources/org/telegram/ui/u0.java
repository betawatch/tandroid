package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
            h4Var.a1.a(h4Var.u0[0].getBackgroundColor(), true);
            h4Var.b1.a(h4Var.u0[1].getBackgroundColor(), true);
            if (u3Var != null) {
                u3Var.y();
            }
            Object v = i0.a.v(1, h4Var.d0);
            h4Var.P0.S(h4Var.u0[0].b);
            org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
            k9Var.z0 = h4Var.u0[0].d;
            k9Var.f(true);
            h4Var.g0(false);
            h4Var.d0();
            h4Var.u0[1].b();
            h4Var.u0[1].setVisibility(8);
            if (v instanceof x2) {
                ((x2) v).a();
            }
            if (v instanceof TLRPC.WebPage) {
                org.telegram.ui.web.y1.o((TLRPC.WebPage) v);
            }
        } else if (u3Var != null) {
            u3Var.release();
            h4Var.q();
        } else {
            h4Var.S();
            h4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        h4Var.U0 = false;
    }
}
