// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
