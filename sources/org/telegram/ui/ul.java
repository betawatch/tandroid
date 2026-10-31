package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ul extends yr0 {
    public final /* synthetic */ org.telegram.messenger.jj a;
    public final /* synthetic */ org.telegram.messenger.ef b;
    public final /* synthetic */ un c;

    public ul(un unVar, org.telegram.messenger.jj jjVar, org.telegram.messenger.ef efVar) {
        this.c = unVar;
        this.a = jjVar;
        this.b = efVar;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.N1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean P() {
        un unVar = this.c;
        if (unVar.Z == null || !unVar.J9()) {
            return false;
        }
        unVar.Z.L();
        return true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.jj V() {
        org.telegram.messenger.jj jjVar = this.c.F5;
        org.telegram.messenger.jj jjVar2 = this.a;
        if (jjVar == jjVar2) {
            return jjVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void e(CharSequence charSequence) {
        this.c.Z.d1(charSequence, false);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        un unVar = this.c;
        if (unVar.F5 != this.a) {
            return;
        }
        org.telegram.messenger.ef efVar = this.b;
        if (efVar.w || efVar.v || efVar.u || x20Var != null) {
            unVar.t(efVar, x20Var, z10, i11, 0, z11, 0L);
        } else {
            unVar.Z.Z();
        }
    }
}
