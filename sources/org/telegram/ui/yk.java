package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yk extends oq0 {
    public final /* synthetic */ org.telegram.messenger.fj a;
    public final /* synthetic */ org.telegram.messenger.ef b;
    public final /* synthetic */ bn c;

    public yk(bn bnVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.c = bnVar;
        this.a = fjVar;
        this.b = efVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.c, this.a, null, i7, z10, true);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean P() {
        bn bnVar = this.c;
        if (bnVar.a0 == null || !bnVar.V9()) {
            return false;
        }
        bnVar.a0.U();
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.fj V() {
        org.telegram.messenger.fj fjVar = this.c.H5;
        org.telegram.messenger.fj fjVar2 = this.a;
        if (fjVar == fjVar2) {
            return fjVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void e(CharSequence charSequence) {
        this.c.a0.I1(charSequence, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        bn bnVar = this.c;
        if (bnVar.H5 != this.a) {
            return;
        }
        org.telegram.messenger.ef efVar = this.b;
        if (efVar.w || efVar.v || efVar.u || d20Var != null) {
            bnVar.u(efVar, d20Var, z10, i10, 0, z11, 0L);
        } else {
            bnVar.a0.u0();
        }
    }
}
