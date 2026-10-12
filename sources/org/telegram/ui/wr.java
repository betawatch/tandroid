package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements org.telegram.ui.Cells.a5, hg.z1 {
    public final /* synthetic */ xr a;

    public /* synthetic */ wr(xr xrVar) {
        this.a = xrVar;
    }

    @Override // hg.z1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        xr xrVar = this.a;
        TLObject E = xrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return xrVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // hg.z1
    public /* synthetic */ a0.h j0() {
        return null;
    }

    @Override // hg.z1
    public void k(int i10) {
        xr xrVar = this.a;
        yr yrVar = xrVar.y;
        if (xrVar.h.e()) {
            return;
        }
        int i11 = xrVar.r;
        xrVar.l();
        if (xrVar.r > i11) {
            yrVar.y0(i11);
        }
        if (xrVar.s || xrVar.r != 0 || i10 == 0) {
            return;
        }
        yrVar.b.e(false, true);
    }

    @Override // hg.z1
    public /* synthetic */ boolean t0(int i10) {
        return true;
    }

    @Override // hg.z1
    public /* synthetic */ void I0(ArrayList arrayList) {
    }
}
