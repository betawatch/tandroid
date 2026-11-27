// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
