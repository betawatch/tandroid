package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.ui.Cells.z4, hg.a2 {
    public final /* synthetic */ ur a;

    public /* synthetic */ tr(ur urVar) {
        this.a = urVar;
    }

    @Override // hg.a2
    public /* synthetic */ a0.i G() {
        return null;
    }

    @Override // hg.a2
    public /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ur urVar = this.a;
        TLObject E = urVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return urVar.y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
    }

    @Override // hg.a2
    public void f(int i10) {
        ur urVar = this.a;
        vr vrVar = urVar.y;
        if (urVar.h.e()) {
            return;
        }
        int i11 = urVar.r;
        urVar.l();
        if (urVar.r > i11) {
            vrVar.y0(i11);
        }
        if (urVar.s || urVar.r != 0 || i10 == 0) {
            return;
        }
        vrVar.b.e(false, true);
    }

    @Override // hg.a2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // hg.a2
    public /* synthetic */ void Y(ArrayList arrayList) {
    }
}
