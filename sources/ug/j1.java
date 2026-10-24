package ug;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j1 extends s4.m0 {
    public final /* synthetic */ l1 a;

    public j1(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        super.a(rect, view, recyclerView, y0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        l1 l1Var = this.a;
        if (R == l1Var.g0.size()) {
            rect.bottom = l1Var.q0;
        }
    }
}
