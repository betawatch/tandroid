package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yk extends oq0 {
    public final /* synthetic */ org.telegram.messenger.gj a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ bn c;

    public yk(bn bnVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.c = bnVar;
        this.a = gjVar;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
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
    public final org.telegram.messenger.gj V() {
        org.telegram.messenger.gj gjVar = this.c.H5;
        org.telegram.messenger.gj gjVar2 = this.a;
        if (gjVar == gjVar2) {
            return gjVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void e(CharSequence charSequence) {
        this.c.a0.H1(charSequence, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        bn bnVar = this.c;
        if (bnVar.H5 != this.a) {
            return;
        }
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.w || ffVar.v || ffVar.u || f20Var != null) {
            bnVar.u(ffVar, f20Var, z10, i10, 0, z11, 0L);
        } else {
            bnVar.a0.u0();
        }
    }
}
