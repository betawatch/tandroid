// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
