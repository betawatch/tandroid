package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public x0(j4 j4Var, int i10) {
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
            m3[] m3VarArr = j4Var.u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            j4Var.h0.i();
            j4Var.a1.a(j4Var.u0[0].getBackgroundColor(), true);
            j4Var.b1.a(j4Var.u0[1].getBackgroundColor(), true);
            v3 v3Var = j4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            j4Var.P0.S(j4Var.u0[0].b);
            org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
            s9Var.z0 = j4Var.u0[0].d;
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
                if (obj instanceof y2) {
                    ((y2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        j4Var.U0 = false;
    }
}
