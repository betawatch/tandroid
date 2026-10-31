package vh;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d2 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ d2(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.t0 t0Var;
        switch (this.a) {
            case 0:
                k2 k2Var = this.b;
                k2Var.getClass();
                k2Var.invalidate();
                break;
            default:
                k2 k2Var2 = this.b;
                if (k2Var2.n.I1 && (t0Var = k2Var2.G) != null && t0Var.getSearchField() != null) {
                    org.telegram.messenger.i0.v1(k2Var2.G.getSearchContainer());
                    break;
                }
                break;
        }
    }
}
