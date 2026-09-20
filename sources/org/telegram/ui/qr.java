package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements org.telegram.ui.Cells.b5, gg.b2 {
    public final /* synthetic */ rr a;

    public /* synthetic */ qr(rr rrVar) {
        this.a = rrVar;
    }

    @Override // gg.b2
    public /* synthetic */ boolean F(int i10) {
        return true;
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

    @Override // org.telegram.ui.Cells.b5
    public boolean e(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        int intValue = ((Integer) c5Var.getTag()).intValue();
        rr rrVar = this.a;
        TLObject E = rrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return rrVar.y.h0((TLRPC.ChannelParticipant) E, !z10, c5Var);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i l() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ void G(ArrayList arrayList) {
    }
}
