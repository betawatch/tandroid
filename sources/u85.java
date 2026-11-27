// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class u85 extends v79 {
    public final /* synthetic */ j95 a;

    public u85(j95 j95Var) {
        this.a = j95Var;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        j95 j95Var = this.a;
        t85 t85Var = j95Var.J1;
        if (i != 0) {
            lg5 lg5Var = j95Var.f2;
            if (lg5Var != null) {
                lg5Var.a();
            }
            lg5 lg5Var2 = j95Var.g2;
            if (lg5Var2 != null) {
                lg5Var2.a();
                return;
            }
            return;
        }
        float L = j95Var.s2 - hl.L(74.0f);
        t85Var.getChildAt(0);
        if (L + j95Var.t0 >= a.getCurrentActionBarHeight() || !t85Var.canScrollVertically(1) || (n69Var = (n69) t85Var.L(0)) == null) {
            return;
        }
        View view = n69Var.a;
        if (view.getTop() > 0) {
            t85Var.y0(0, view.getTop(), null);
        }
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        vc2 vc2Var;
        j95 j95Var = this.a;
        if (j95Var.J1.getChildCount() <= 0 || (vc2Var = j95Var.T2) == null) {
            return;
        }
        if (!vc2Var.u && !vc2Var.t && j95Var.R1.M0() > j95Var.I1.G - 5) {
            j95Var.T2.l(false);
        }
        j95Var.G1();
        j95Var.b.invalidate();
    }
}
