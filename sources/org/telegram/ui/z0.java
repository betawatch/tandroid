package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public z0(k4 k4Var, int i10) {
        this.b = k4Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k4 k4Var = this.b;
        ArrayList arrayList = k4Var.d0;
        if (k4Var.f0.f) {
            ArrayList arrayList2 = new ArrayList();
            k4Var.u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = k4Var.u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            k4Var.h0.i();
            k4Var.a1.a(k4Var.u0[0].getBackgroundColor(), true);
            k4Var.b1.a(k4Var.u0[1].getBackgroundColor(), true);
            w3 w3Var = k4Var.K;
            if (w3Var != null) {
                w3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            k4Var.P0.S(k4Var.u0[0].b);
            org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
            o9Var.z0 = k4Var.u0[0].d;
            o9Var.f(true);
            k4Var.i0(false);
            k4Var.f0();
            k4Var.u0[1].b();
            k4Var.u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof a3) {
                    ((a3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            k4Var.U();
            k4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        k4Var.U0 = false;
    }
}
