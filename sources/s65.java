// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s65 extends i49 {
    public final /* synthetic */ h75 a;

    public s65(h75 h75Var) {
        this.a = h75Var;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        h75 h75Var = this.a;
        r65 r65Var = h75Var.J1;
        if (i != 0) {
            ke5 ke5Var = h75Var.f2;
            if (ke5Var != null) {
                ke5Var.a();
            }
            ke5 ke5Var2 = h75Var.g2;
            if (ke5Var2 != null) {
                ke5Var2.a();
                return;
            }
            return;
        }
        float L = h75Var.s2 - gl.L(74.0f);
        r65Var.getChildAt(0);
        if (L + h75Var.t0 >= a.getCurrentActionBarHeight() || !r65Var.canScrollVertically(1) || (y29Var = (y29) r65Var.K(0)) == null) {
            return;
        }
        View view = y29Var.a;
        if (view.getTop() > 0) {
            r65Var.x0(0, view.getTop(), null);
        }
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        fc2 fc2Var;
        h75 h75Var = this.a;
        if (h75Var.J1.getChildCount() <= 0 || (fc2Var = h75Var.T2) == null) {
            return;
        }
        if (!fc2Var.u && !fc2Var.t && h75Var.R1.M0() > h75Var.I1.G - 5) {
            h75Var.T2.l(false);
        }
        h75Var.F1();
        h75Var.b.invalidate();
    }
}
