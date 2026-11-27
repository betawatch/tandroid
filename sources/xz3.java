// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xz3 extends u55 {
    public final /* synthetic */ o24 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz3(o24 o24Var) {
        super(5);
        this.Q = o24Var;
    }

    @Override // u55, x46, q79
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        int n0 = super.n0(i, oh2Var, c89Var);
        o24 o24Var = this.Q;
        if (n0 != 0 && o24Var.E0.getScrollState() == 1) {
            o24Var.Y1 = false;
            o24Var.Y();
        }
        if (o24Var.U0 == null) {
            h04 h04Var = new h04(o24Var, o24Var.d1, o24Var.u1.a(), o24Var.u1.f(), (byte) 0);
            o24Var.U0 = h04Var;
            h04Var.a();
        }
        o24Var.U0.b();
        return n0;
    }

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        try {
            z46 z46Var = new z46(recyclerView.getContext(), 2);
            z46Var.a = i;
            v0(z46Var);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
