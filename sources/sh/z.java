package sh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class z implements n0 {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ i0 b;

    public z(i0 i0Var, p2 p2Var) {
        this.b = i0Var;
        this.a = p2Var;
    }

    @Override // sh.n0
    public final void b(long j10) {
        this.a.presentFragment(xn.R9(j10));
        this.b.dismiss();
    }

    @Override // sh.n0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // sh.n0
    public final void d() {
        i0 i0Var = this.b;
        i0Var.w.d.V2.N(true);
        i0Var.v.d.V2.N(true);
    }
}
