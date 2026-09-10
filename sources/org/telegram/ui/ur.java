package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur implements org.telegram.ui.Cells.a5, fg.c2 {
    public final /* synthetic */ vr a;

    public /* synthetic */ ur(vr vrVar) {
        this.a = vrVar;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i D() {
        return null;
    }

    @Override // fg.c2
    public /* synthetic */ a0.i P() {
        return null;
    }

    @Override // fg.c2
    public void a(int i10) {
        vr vrVar = this.a;
        wr wrVar = vrVar.y;
        if (vrVar.h.e()) {
            return;
        }
        int i11 = vrVar.r;
        vrVar.l();
        if (vrVar.r > i11) {
            wrVar.y0(i11);
        }
        if (vrVar.s || vrVar.r != 0 || i10 == 0) {
            return;
        }
        wrVar.b.e(false, true);
    }

    @Override // fg.c2
    public /* synthetic */ boolean c0(int i10) {
        return true;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        vr vrVar = this.a;
        TLObject E = vrVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return vrVar.y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
    }

    @Override // fg.c2
    public /* synthetic */ void k0(ArrayList arrayList) {
    }
}
