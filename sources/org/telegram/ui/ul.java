package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ul extends xr0 {
    public final /* synthetic */ org.telegram.messenger.kj a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ un c;

    public ul(un unVar, org.telegram.messenger.kj kjVar, org.telegram.messenger.ff ffVar) {
        this.c = unVar;
        this.a = kjVar;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.O1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean P() {
        un unVar = this.c;
        if (unVar.Z == null || !unVar.O9()) {
            return false;
        }
        unVar.Z.K();
        return true;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.messenger.kj V() {
        org.telegram.messenger.kj kjVar = this.c.F5;
        org.telegram.messenger.kj kjVar2 = this.a;
        if (kjVar == kjVar2) {
            return kjVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void e(CharSequence charSequence) {
        this.c.Z.d1(charSequence, false);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        un unVar = this.c;
        if (unVar.F5 != this.a) {
            return;
        }
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.w || ffVar.v || ffVar.u || y20Var != null) {
            unVar.u(ffVar, y20Var, z10, i11, 0, z11, 0L);
        } else {
            unVar.Z.Z();
        }
    }
}
