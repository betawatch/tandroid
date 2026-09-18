package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m1 extends s4.n0 {
    public final /* synthetic */ n1 a;

    public m1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        n1 n1Var = this.a;
        if (S == n1Var.g0.size()) {
            rect.bottom = n1Var.q0;
        }
    }
}
