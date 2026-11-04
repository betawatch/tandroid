package vg;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q0 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ q0(v0 v0Var, int i3) {
        this.a = i3;
        this.b = v0Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                v0Var.b.invalidate();
                v0Var.I0();
                break;
            default:
                v0 v0Var2 = this.b;
                v0Var2.b.invalidate();
                v0Var2.I0();
                break;
        }
    }
}
