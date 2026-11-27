// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ps5 extends v79 {
    public final /* synthetic */ x46 a;
    public final /* synthetic */ bt5 b;

    public ps5(bt5 bt5Var, x46 x46Var) {
        this.b = bt5Var;
        this.a = x46Var;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        bt5 bt5Var = this.b;
        bt5Var.J0();
        if (!bt5Var.L1 || bt5Var.K1) {
            return;
        }
        if (bt5Var.M1 - this.a.M0() < 10) {
            bt5Var.F0();
        }
    }
}
