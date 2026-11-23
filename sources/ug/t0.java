package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t0 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y0 b;

    public /* synthetic */ t0(y0 y0Var, int i7) {
        this.a = i7;
        this.b = y0Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                y0 y0Var = this.b;
                y0Var.b.invalidate();
                y0Var.J0();
                break;
            default:
                y0 y0Var2 = this.b;
                y0Var2.b.invalidate();
                y0Var2.J0();
                break;
        }
    }
}
