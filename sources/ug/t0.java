package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
