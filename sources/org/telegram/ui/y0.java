package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public y0(j4 j4Var, int i10) {
        this.b = j4Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j4 j4Var = this.b;
        ArrayList arrayList = j4Var.d0;
        if (j4Var.f0.f) {
            ArrayList arrayList2 = new ArrayList();
            j4Var.u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = j4Var.u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            j4Var.h0.i();
            j4Var.Z0.a(j4Var.u0[0].getBackgroundColor(), true);
            j4Var.a1.a(j4Var.u0[1].getBackgroundColor(), true);
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            j4Var.O0.T(j4Var.u0[0].b);
            org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
            s9Var.E0 = j4Var.u0[0].d;
            s9Var.f(true);
            j4Var.i0(false);
            j4Var.f0();
            j4Var.u0[1].b();
            j4Var.u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof a3) {
                    ((a3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.k2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        j4Var.T0 = false;
    }
}
