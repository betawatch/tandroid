package th;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z implements m0 {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ i0 b;

    public z(i0 i0Var, p2 p2Var) {
        this.b = i0Var;
        this.a = p2Var;
    }

    @Override // th.m0
    public final void a(long j10) {
        this.a.presentFragment(xn.R9(j10));
        this.b.dismiss();
    }

    @Override // th.m0
    public final void close() {
        this.b.d.D(0);
    }

    @Override // th.m0
    public final void e() {
        i0 i0Var = this.b;
        i0Var.w.d.V2.N(true);
        i0Var.v.d.V2.N(true);
    }
}
