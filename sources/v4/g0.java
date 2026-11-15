package v4;

import a8.va;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ff;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g0 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ g0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(e1 e1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        boolean z10;
        e1 T;
        int i7;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(e1Var);
        recyclerView.h(e1Var);
        e1Var.q(false);
        g1 g1Var = (g1) recyclerView.d0;
        g1Var.getClass();
        int i10 = r0Var.a;
        int i11 = r0Var.b;
        View view = e1Var.a;
        int left = r0Var2 == null ? view.getLeft() : r0Var2.a;
        int top = r0Var2 == null ? view.getTop() : r0Var2.b;
        if (e1Var.j() || (i10 == left && i11 == top)) {
            int i12 = e1Var.h;
            int i13 = -1;
            if (i12 != -1) {
                for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                    View childAt = recyclerView.getChildAt(i14);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i7 = T.h) >= 0 && i7 < i12 && i7 > i13) {
                        i13 = i7;
                    }
                }
            }
            e1Var.i = (e1Var.h - i13) + (i13 * 1000);
            g1Var.s(e1Var, r0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = g1Var.r(e1Var, r0Var, i10, i11, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(e1 e1Var) {
        RecyclerView recyclerView = this.a;
        o0 o0Var = recyclerView.y;
        View view = e1Var.a;
        w0 w0Var = recyclerView.b;
        ld0 ld0Var = o0Var.a;
        ff ffVar = (ff) ld0Var.b;
        int indexOfChild = ((RecyclerView) ffVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((va) ld0Var.c).x(indexOfChild)) {
                ld0Var.K(view);
            }
            ffVar.C0(indexOfChild);
        }
        w0Var.g(view);
    }
}
