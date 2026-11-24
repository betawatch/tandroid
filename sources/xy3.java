// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xy3 extends c49 {
    public final /* synthetic */ t14 a;

    public xy3(t14 t14Var) {
        this.a = t14Var;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        int R = RecyclerView.R(view);
        t14 t14Var = this.a;
        w39 adapter = t14Var.i0.getAdapter();
        y04 y04Var = t14Var.o0;
        if (adapter == y04Var && R == y04Var.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            y04Var.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = gl.L(2.0f);
        z04 z04Var = t14Var.j0;
        y04Var.getClass();
        rect.right = z04Var.C1(R) ? 0 : gl.L(2.0f);
    }
}
