package ug;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
