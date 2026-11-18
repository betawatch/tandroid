package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ g4 a;

    public s0(g4 g4Var) {
        this.a = g4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.a;
        t3 t3Var = g4Var.L;
        if (g4Var.g0.e) {
            g4Var.v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.i0.i();
            g4Var.b1.a(g4Var.v0[0].getBackgroundColor(), true);
            g4Var.c1.a(g4Var.v0[1].getBackgroundColor(), true);
            if (t3Var != null) {
                t3Var.z();
            }
            Object g10 = p5.c.g(1, g4Var.e0);
            g4Var.Q0.S(g4Var.v0[0].b);
            org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
            i9Var.z0 = g4Var.v0[0].d;
            i9Var.f(true);
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
        } else if (t3Var != null) {
            t3Var.release();
            g4Var.q();
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.g0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
