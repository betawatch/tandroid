package vg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
