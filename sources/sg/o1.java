package sg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o1 extends s4.n0 {
    public final /* synthetic */ p1 a;

    public o1(p1 p1Var) {
        this.a = p1Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        super.a(rect, view, recyclerView, z0Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        p1 p1Var = this.a;
        if (R == p1Var.g0.size()) {
            rect.bottom = p1Var.q0;
        }
    }
}
