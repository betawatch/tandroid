package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public z0(l4 l4Var, int i10) {
        this.b = l4Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.b;
        ArrayList arrayList = l4Var.a0;
        if (l4Var.c0.f) {
            ArrayList arrayList2 = new ArrayList();
            l4Var.r0[0].setBackgroundDrawable(null);
            p3[] p3VarArr = l4Var.r0;
            p3 p3Var = p3VarArr[1];
            p3VarArr[1] = p3VarArr[0];
            p3VarArr[0] = p3Var;
            l4Var.e0.i();
            l4Var.W0.a(l4Var.r0[0].getBackgroundColor(), true);
            l4Var.X0.a(l4Var.r0[1].getBackgroundColor(), true);
            y3 y3Var = l4Var.H;
            if (y3Var != null) {
                y3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            l4Var.L0.T(l4Var.r0[0].b);
            org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
            m9Var.E0 = l4Var.r0[0].d;
            m9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.r0[1].b();
            l4Var.r0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof b3) {
                    ((b3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.c0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        l4Var.Q0 = false;
    }
}
