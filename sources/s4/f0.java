package s4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f0 {
    public final RecyclerView a;

    public /* synthetic */ f0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(c1 c1Var, ac.g gVar, ac.g gVar2) {
        boolean z10;
        c1 T;
        int i10;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.c0;
        f1Var.getClass();
        int i11 = gVar.a;
        int i12 = gVar.b;
        View view = c1Var.a;
        int left = gVar2 == null ? view.getLeft() : gVar2.a;
        int top = gVar2 == null ? view.getTop() : gVar2.b;
        if (c1Var.j() || (i11 == left && i12 == top)) {
            int i13 = c1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            c1Var.i = (c1Var.h - i14) + (i14 * 1000);
            f1Var.s(c1Var, gVar);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(c1Var, gVar, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(c1 c1Var) {
        RecyclerView recyclerView = this.a;
        n0 n0Var = recyclerView.y;
        View view = c1Var.a;
        hf.e eVar = recyclerView.b;
        q5.d dVar = n0Var.a;
        m2.t tVar = (m2.t) dVar.b;
        int indexOfChild = ((RecyclerView) tVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c3.g0) dVar.c).H(indexOfChild)) {
                dVar.y(view);
            }
            tVar.J(indexOfChild);
        }
        eVar.g(view);
    }
}
