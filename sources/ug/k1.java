package ug;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k1 extends s4.m0 {
    public final /* synthetic */ m1 a;

    public k1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        super.a(rect, view, recyclerView, y0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        m1 m1Var = this.a;
        if (R == m1Var.g0.size()) {
            rect.bottom = m1Var.q0;
        }
    }
}
