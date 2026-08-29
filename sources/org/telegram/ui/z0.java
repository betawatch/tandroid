package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ m4 a;

    public z0(m4 m4Var) {
        this.a = m4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m4 m4Var = this.a;
        if (m4Var.b0.f) {
            m4Var.q0[0].setBackgroundDrawable(null);
            q3[] q3VarArr = m4Var.q0;
            q3 q3Var = q3VarArr[1];
            q3VarArr[1] = q3VarArr[0];
            q3VarArr[0] = q3Var;
            m4Var.d0.i();
            m4Var.V0.a(m4Var.q0[0].getBackgroundColor(), true);
            m4Var.W0.a(m4Var.q0[1].getBackgroundColor(), true);
            z3 z3Var = m4Var.G;
            if (z3Var != null) {
                z3Var.m();
            }
            Object j10 = com.google.android.recaptcha.internal.a.j(1, m4Var.Z);
            m4Var.K0.T(m4Var.q0[0].b);
            org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
            k9Var.E0 = m4Var.q0[0].d;
            k9Var.f(true);
            m4Var.i0(false);
            m4Var.f0();
            m4Var.q0[1].b();
            m4Var.q0[1].setVisibility(8);
            if (j10 instanceof d3) {
                ((d3) j10).a();
            }
            if (j10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.f2.o((TLRPC.WebPage) j10);
            }
        } else {
            m4Var.U();
            m4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = m4Var.b0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        m4Var.P0 = false;
    }
}
