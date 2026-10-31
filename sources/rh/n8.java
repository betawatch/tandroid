package rh;

import android.content.Context;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n8 extends v8 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ int n0;
    public final /* synthetic */ y8 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(y8 y8Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, int i10) {
        super(context, p6Var);
        this.o0 = y8Var;
        this.m0 = z10;
        this.n0 = i10;
    }

    @Override // rh.v8
    public final void e(int i10) {
        long j10 = i10;
        y8 y8Var = this.o0;
        y8Var.N0(j10);
        vh.d dVar = y8Var.t1;
        if (dVar != null) {
            dVar.i(h8.X0(false, cd.a0(null, null, 2131745065, cd.E(j10, ',')), y8Var.J1), true, true);
        }
        if (this.m0) {
            th.h0 h0Var = y8Var.x1;
            h0Var.g = j10;
            y8Var.y1.set(h0Var);
            int i11 = this.n0;
            f(th.o.b(i11, i10, 3), th.o.b(i11, i10, 4), true);
        }
    }

    @Override // rh.v8
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.n0;
            f(th.o.b(i11, i10, 3), th.o.b(i11, i10, 4), true);
        }
    }
}
