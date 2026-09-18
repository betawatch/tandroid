package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final /* synthetic */ rr a;

    public /* synthetic */ qr(rr rrVar) {
        this.a = rrVar;
    }

    @Override // gg.b2
    public void a(int i10) {
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

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        rr rrVar = this.a;
        TLObject E = rrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return rrVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i i() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i o() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean s(int i10) {
        return true;
    }

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }
}
