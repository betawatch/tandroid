package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        int R = RecyclerView.R(view);
        m1 m1Var = this.a;
        if (R == m1Var.g0.size()) {
            rect.bottom = m1Var.q0;
        }
    }
}
