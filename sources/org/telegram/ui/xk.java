package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class xk extends mq0 {
    public final /* synthetic */ org.telegram.messenger.gj a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ an c;

    public xk(an anVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.c = anVar;
        this.a = gjVar;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return an.P1(this.c, this.a, null, i7, z10, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean P() {
        an anVar = this.c;
        if (anVar.a0 == null || !anVar.V9()) {
            return false;
        }
        anVar.a0.S();
        return true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.gj V() {
        org.telegram.messenger.gj gjVar = this.c.G5;
        org.telegram.messenger.gj gjVar2 = this.a;
        if (gjVar == gjVar2) {
            return gjVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void e(CharSequence charSequence) {
        this.c.a0.v1(charSequence, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        an anVar = this.c;
        if (anVar.G5 != this.a) {
            return;
        }
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.w || ffVar.v || ffVar.u || g20Var != null) {
            anVar.u(ffVar, g20Var, z10, i10, 0, z11, 0L);
        } else {
            anVar.a0.j0();
        }
    }
}
