package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t0 extends AnimatorListenerAdapter {
    public final /* synthetic */ g4 a;

    public t0(g4 g4Var) {
        this.a = g4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.a;
        if (g4Var.g0.f) {
            g4Var.v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.i0.i();
            g4Var.b1.a(g4Var.v0[0].getBackgroundColor(), true);
            g4Var.c1.a(g4Var.v0[1].getBackgroundColor(), true);
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.z();
            }
            Object g10 = p5.c.g(1, g4Var.e0);
            g4Var.Q0.S(g4Var.v0[0].b);
            org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
            j9Var.z0 = g4Var.v0[0].d;
            j9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.v0[1].b();
            g4Var.v0[1].setVisibility(8);
            if (g10 instanceof x2) {
                ((x2) g10).a();
            }
            if (g10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.v1.o((TLRPC.WebPage) g10);
            }
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.g0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
