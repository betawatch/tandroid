// default package

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class xz3 extends s14 {
    public final /* synthetic */ t14 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz3(t14 t14Var) {
        super(t14Var, 1);
        this.d = t14Var;
    }

    @Override // s14, i49
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i);
    }

    @Override // s14, i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        t14 t14Var = this.d;
        uz3 uz3Var = t14Var.R;
        t14Var.V(uz3Var.H0());
        super.b(recyclerView, i, i2);
        t04 t04Var = t14Var.T;
        if (t04Var == null || t14Var.Q.getAdapter() != t04Var) {
            return;
        }
        t04 t04Var2 = t04Var.y.a;
        if (t04Var2.G.W.G || t04Var2.F) {
            return;
        }
        if (uz3Var.M0() + 20 > t04Var.b()) {
            s04 s04Var = t04Var.y;
            Objects.requireNonNull(s04Var);
            gl.d3(new li3(s04Var, (byte) 26));
        }
    }
}
