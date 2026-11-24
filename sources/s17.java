// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s17 extends e69 {
    public final /* synthetic */ t17 a;

    public s17(t17 t17Var) {
        this.a = t17Var;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f69 layoutManager = recyclerView.getLayoutManager();
        u17 u17Var = this.a.j3;
        if (layoutManager != u17Var.d || (R = RecyclerView.R(view)) == 0 || u17Var.f.N()) {
            return;
        }
        if (u17Var.f.I() == null && u17Var.f.V == null) {
            rect.top = gm.L(2.0f);
        } else {
            R--;
            n17 n17Var = u17Var.d;
            n17Var.z1();
            if (R > n17Var.U) {
                rect.top = gm.L(2.0f);
            }
        }
        rect.right = u17Var.d.C1(R) ? 0 : gm.L(2.0f);
    }
}
