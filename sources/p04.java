// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p04 extends u55 {
    public final /* synthetic */ o24 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p04(o24 o24Var) {
        super(8);
        this.Q = o24Var;
    }

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        try {
            aw3 aw3Var = new aw3((byte) 2, recyclerView.getContext(), this);
            aw3Var.a = i;
            v0(aw3Var);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
