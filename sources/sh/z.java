package sh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class z implements m0 {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ i0 b;

    public z(i0 i0Var, p2 p2Var) {
        this.b = i0Var;
        this.a = p2Var;
    }

    @Override // sh.m0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // sh.m0
    public final void d(long j10) {
        this.a.presentFragment(zn.R9(j10));
        this.b.dismiss();
    }

    @Override // sh.m0
    public final void f() {
        i0 i0Var = this.b;
        i0Var.w.d.V2.N(true);
        i0Var.v.d.V2.N(true);
    }
}
