package u4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g0 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ g0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2) {
        boolean z10;
        d1 T;
        int i3;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(d1Var);
        recyclerView.h(d1Var);
        d1Var.q(false);
        f1 f1Var = (f1) recyclerView.d0;
        f1Var.getClass();
        int i10 = t0Var.a;
        int i11 = t0Var.b;
        View view = d1Var.a;
        int left = t0Var2 == null ? view.getLeft() : t0Var2.a;
        int top = t0Var2 == null ? view.getTop() : t0Var2.b;
        if (d1Var.j() || (i10 == left && i11 == top)) {
            int i12 = d1Var.h;
            int i13 = -1;
            if (i12 != -1) {
                for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                    View childAt = recyclerView.getChildAt(i14);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i3 = T.h) >= 0 && i3 < i12 && i3 > i13) {
                        i13 = i3;
                    }
                }
            }
            d1Var.i = (d1Var.h - i13) + (i13 * 1000);
            f1Var.s(d1Var, t0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(d1Var, t0Var, i10, i11, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(d1 d1Var) {
        RecyclerView recyclerView = this.a;
        o0 o0Var = recyclerView.y;
        View view = d1Var.a;
        tf.e eVar = recyclerView.b;
        p7.d dVar = o0Var.a;
        nh nhVar = (nh) dVar.b;
        int indexOfChild = ((RecyclerView) nhVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ig) dVar.d).G(indexOfChild)) {
                dVar.H(view);
            }
            nhVar.I(indexOfChild);
        }
        eVar.g(view);
    }
}
