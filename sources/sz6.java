// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sz6 extends c49 {
    public final /* synthetic */ tz6 a;

    public sz6(tz6 tz6Var) {
        this.a = tz6Var;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        d49 layoutManager = recyclerView.getLayoutManager();
        uz6 uz6Var = this.a.j3;
        if (layoutManager != uz6Var.d || (R = RecyclerView.R(view)) == 0 || uz6Var.f.N()) {
            return;
        }
        if (uz6Var.f.I() == null && uz6Var.f.V == null) {
            rect.top = gl.L(2.0f);
        } else {
            R--;
            nz6 nz6Var = uz6Var.d;
            nz6Var.z1();
            if (R > nz6Var.U) {
                rect.top = gl.L(2.0f);
            }
        }
        rect.right = uz6Var.d.C1(R) ? 0 : gl.L(2.0f);
    }
}
