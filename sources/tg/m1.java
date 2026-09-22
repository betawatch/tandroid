package tg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        int R = RecyclerView.R(view);
        n1 n1Var = this.a;
        if (R == n1Var.g0.size()) {
            rect.bottom = n1Var.q0;
        }
    }
}
