package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class w0 extends AnimatorListenerAdapter {
    public final /* synthetic */ i4 a;

    public w0(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.a;
        if (i4Var.f0.f) {
            i4Var.u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.h0.i();
            i4Var.Z0.a(i4Var.u0[0].getBackgroundColor(), true);
            i4Var.a1.a(i4Var.u0[1].getBackgroundColor(), true);
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            Object x10 = hg.c.x(1, i4Var.d0);
            i4Var.O0.T(i4Var.u0[0].b);
            org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
            q9Var.E0 = i4Var.u0[0].d;
            q9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.u0[1].b();
            i4Var.u0[1].setVisibility(8);
            if (x10 instanceof z2) {
                ((z2) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) x10);
            }
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
