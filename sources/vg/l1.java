package vg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l1 extends s4.n0 {
    public final /* synthetic */ n1 a;

    public l1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        super.d(rect, view, recyclerView, b1Var);
        int R = RecyclerView.R(view);
        n1 n1Var = this.a;
        if (R == n1Var.g0.size()) {
            rect.bottom = n1Var.q0;
        }
    }
}
