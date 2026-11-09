package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class zk extends pq0 {
    public final /* synthetic */ org.telegram.messenger.ij a;
    public final /* synthetic */ org.telegram.messenger.gf b;
    public final /* synthetic */ cn c;

    public zk(cn cnVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.c = cnVar;
        this.a = ijVar;
        this.b = gfVar;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return cn.P1(this.c, this.a, null, i7, z9, true);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean P() {
        cn cnVar = this.c;
        if (cnVar.Z == null || !cnVar.U9()) {
            return false;
        }
        cnVar.Z.L();
        return true;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final org.telegram.messenger.ij V() {
        org.telegram.messenger.ij ijVar = this.c.F5;
        org.telegram.messenger.ij ijVar2 = this.a;
        if (ijVar == ijVar2) {
            return ijVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void e(CharSequence charSequence) {
        this.c.Z.f1(charSequence, false);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        cn cnVar = this.c;
        if (cnVar.F5 != this.a) {
            return;
        }
        org.telegram.messenger.gf gfVar = this.b;
        if (gfVar.w || gfVar.v || gfVar.u || j20Var != null) {
            cnVar.u(gfVar, j20Var, z9, i10, 0, z10, 0L);
        } else {
            cnVar.Z.a0();
        }
    }
}
