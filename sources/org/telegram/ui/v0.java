package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v0 extends AnimatorListenerAdapter {
    public final /* synthetic */ j4 a;

    public v0(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j4 j4Var = this.a;
        w3 w3Var = j4Var.K;
        if (j4Var.f0.e) {
            j4Var.u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = j4Var.u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            j4Var.h0.i();
            j4Var.Z0.a(j4Var.u0[0].getBackgroundColor(), true);
            j4Var.a1.a(j4Var.u0[1].getBackgroundColor(), true);
            if (w3Var != null) {
                w3Var.m();
            }
            Object z10 = hc.b.z(1, j4Var.d0);
            j4Var.O0.T(j4Var.u0[0].b);
            org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
            s9Var.E0 = j4Var.u0[0].d;
            s9Var.f(true);
            j4Var.i0(false);
            j4Var.f0();
            j4Var.u0[1].b();
            j4Var.u0[1].setVisibility(8);
            if (z10 instanceof a3) {
                ((a3) z10).a();
            }
            if (z10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.k2.o((TLRPC.WebPage) z10);
            }
        } else if (w3Var != null) {
            w3Var.release();
            j4Var.s();
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        j4Var.T0 = false;
    }
}
