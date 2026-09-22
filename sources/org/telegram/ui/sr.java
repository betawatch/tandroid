package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final /* synthetic */ tr a;

    public /* synthetic */ sr(tr trVar) {
        this.a = trVar;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i F() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        tr trVar = this.a;
        TLObject E = trVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return trVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // gg.b2
    public void h(int i10) {
        tr trVar = this.a;
        ur urVar = trVar.y;
        if (trVar.h.e()) {
            return;
        }
        int i11 = trVar.r;
        trVar.l();
        if (trVar.r > i11) {
            urVar.y0(i11);
        }
        if (trVar.s || trVar.r != 0 || i10 == 0) {
            return;
        }
        urVar.b.e(false, true);
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ void Q(ArrayList arrayList) {
    }
}
