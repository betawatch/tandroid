// default package

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s04 extends n24 {
    public final /* synthetic */ o24 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s04(o24 o24Var) {
        super(o24Var, 1);
        this.d = o24Var;
    }

    @Override // n24, v79
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.d.g0 = false;
        }
        super.a(recyclerView, i);
    }

    @Override // n24, v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        o24 o24Var = this.d;
        p04 p04Var = o24Var.R;
        o24Var.U(p04Var.H0());
        super.b(recyclerView, i, i2);
        o14 o14Var = o24Var.T;
        if (o14Var == null || o24Var.Q.getAdapter() != o14Var) {
            return;
        }
        o14 o14Var2 = o14Var.y.a;
        if (o14Var2.G.W.G || o14Var2.F) {
            return;
        }
        if (p04Var.M0() + 20 > o14Var.b()) {
            n14 n14Var = o14Var.y;
            Objects.requireNonNull(n14Var);
            hl.c3(new lw3(n14Var, (byte) 5));
        }
    }
}
