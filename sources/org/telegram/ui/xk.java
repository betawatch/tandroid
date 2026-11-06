package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xk extends nq0 {
    public final /* synthetic */ org.telegram.messenger.ij a;
    public final /* synthetic */ org.telegram.messenger.gf b;
    public final /* synthetic */ an c;

    public xk(an anVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.c = anVar;
        this.a = ijVar;
        this.b = gfVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return an.O1(this.c, this.a, null, i7, z9, true);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean P() {
        an anVar = this.c;
        if (anVar.Z == null || !anVar.T9()) {
            return false;
        }
        anVar.Z.L();
        return true;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.ij V() {
        org.telegram.messenger.ij ijVar = this.c.F5;
        org.telegram.messenger.ij ijVar2 = this.a;
        if (ijVar == ijVar2) {
            return ijVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void e(CharSequence charSequence) {
        this.c.Z.e1(charSequence, false);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        an anVar = this.c;
        if (anVar.F5 != this.a) {
            return;
        }
        org.telegram.messenger.gf gfVar = this.b;
        if (gfVar.w || gfVar.v || gfVar.u || j20Var != null) {
            anVar.u(gfVar, j20Var, z9, i10, 0, z10, 0L);
        } else {
            anVar.Z.a0();
        }
    }
}
