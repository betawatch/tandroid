package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements org.telegram.ui.Cells.a5, gg.a2 {
    public final /* synthetic */ sr a;

    public /* synthetic */ rr(sr srVar) {
        this.a = srVar;
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        sr srVar = this.a;
        TLObject E = srVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return srVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        return null;
    }

    @Override // gg.a2
    public void h(int i10) {
        sr srVar = this.a;
        tr trVar = srVar.y;
        if (srVar.h.e()) {
            return;
        }
        int i11 = srVar.r;
        srVar.l();
        if (srVar.r > i11) {
            trVar.y0(i11);
        }
        if (srVar.s || srVar.r != 0 || i10 == 0) {
            return;
        }
        trVar.b.e(false, true);
    }

    @Override // gg.a2
    public /* synthetic */ boolean s0(int i10) {
        return true;
    }

    @Override // gg.a2
    public /* synthetic */ void x0(ArrayList arrayList) {
    }
}
