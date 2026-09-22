package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements org.telegram.ui.Cells.b5, gg.b2 {
    public final /* synthetic */ rr a;

    public /* synthetic */ qr(rr rrVar) {
        this.a = rrVar;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean L(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.b5
    public boolean c(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        int intValue = ((Integer) c5Var.getTag()).intValue();
        rr rrVar = this.a;
        TLObject E = rrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return rrVar.y.h0((TLRPC.ChannelParticipant) E, !z10, c5Var);
    }

    @Override // gg.b2
    public void f(int i10) {
        rr rrVar = this.a;
        sr srVar = rrVar.y;
        if (rrVar.h.e()) {
            return;
        }
        int i11 = rrVar.r;
        rrVar.l();
        if (rrVar.r > i11) {
            srVar.y0(i11);
        }
        if (rrVar.s || rrVar.r != 0 || i10 == 0) {
            return;
        }
        srVar.b.e(false, true);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ void O(ArrayList arrayList) {
    }
}
