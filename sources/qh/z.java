package qh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class z implements n0 {
    public final /* synthetic */ o2 a;
    public final /* synthetic */ i0 b;

    public z(i0 i0Var, o2 o2Var) {
        this.b = i0Var;
        this.a = o2Var;
    }

    @Override // qh.n0
    public final void a(long j10) {
        this.a.presentFragment(tn.R9(j10));
        this.b.dismiss();
    }

    @Override // qh.n0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // qh.n0
    public final void k() {
        i0 i0Var = this.b;
        i0Var.w.d.U2.N(true);
        i0Var.v.d.U2.N(true);
    }
}
