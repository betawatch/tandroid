package ug;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
