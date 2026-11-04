package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v0 extends AnimatorListenerAdapter {
    public final /* synthetic */ i4 a;

    public v0(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.a;
        u3 u3Var = i4Var.L;
        if (i4Var.g0.e) {
            i4Var.v0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = i4Var.v0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            i4Var.i0.i();
            i4Var.b1.a(i4Var.v0[0].getBackgroundColor(), true);
            i4Var.c1.a(i4Var.v0[1].getBackgroundColor(), true);
            if (u3Var != null) {
                u3Var.z();
            }
            Object o10 = org.telegram.ui.Cells.f1.o(1, i4Var.e0);
            i4Var.Q0.S(i4Var.v0[0].b);
            org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
            h9Var.z0 = i4Var.v0[0].d;
            h9Var.f(true);
            i4Var.g0(false);
            i4Var.d0();
            i4Var.v0[1].b();
            i4Var.v0[1].setVisibility(8);
            if (o10 instanceof y2) {
                ((y2) o10).a();
            }
            if (o10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.u1.o((TLRPC.WebPage) o10);
            }
        } else if (u3Var != null) {
            u3Var.release();
            i4Var.q();
        } else {
            i4Var.S();
            i4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.g0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        i4Var.V0 = false;
    }
}
