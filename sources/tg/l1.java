package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class l1 extends s4.n0 {
    public final /* synthetic */ m1 a;

    public l1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        m1 m1Var = this.a;
        if (S == m1Var.g0.size()) {
            rect.bottom = m1Var.q0;
        }
    }
}
