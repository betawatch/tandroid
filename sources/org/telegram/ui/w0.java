package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public w0(i4 i4Var, int i3) {
        this.b = i4Var;
        this.a = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.b;
        ArrayList arrayList = i4Var.e0;
        if (i4Var.g0.f) {
            ArrayList arrayList2 = new ArrayList();
            i4Var.v0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = i4Var.v0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            i4Var.i0.i();
            i4Var.b1.a(i4Var.v0[0].getBackgroundColor(), true);
            i4Var.c1.a(i4Var.v0[1].getBackgroundColor(), true);
            u3 u3Var = i4Var.L;
            if (u3Var != null) {
                u3Var.z();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            i4Var.Q0.S(i4Var.v0[0].b);
            org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
            h9Var.z0 = i4Var.v0[0].d;
            h9Var.f(true);
            i4Var.g0(false);
            i4Var.d0();
            i4Var.v0[1].b();
            i4Var.v0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList2.get(i3);
                i3++;
                if (obj instanceof y2) {
                    ((y2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.u1.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            i4Var.S();
            i4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.g0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        i4Var.V0 = false;
    }
}
