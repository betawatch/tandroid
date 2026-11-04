package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tk extends eq0 {
    public final /* synthetic */ org.telegram.messenger.zi a;
    public final /* synthetic */ org.telegram.messenger.ye b;
    public final /* synthetic */ wm c;

    public tk(wm wmVar, org.telegram.messenger.zi ziVar, org.telegram.messenger.ye yeVar) {
        this.c = wmVar;
        this.a = ziVar;
        this.b = yeVar;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        return wm.O1(this.c, this.a, null, i3, z10, true);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean P() {
        wm wmVar = this.c;
        if (wmVar.a0 == null || !wmVar.T9()) {
            return false;
        }
        wmVar.a0.L();
        return true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.zi V() {
        org.telegram.messenger.zi ziVar = this.c.G5;
        org.telegram.messenger.zi ziVar2 = this.a;
        if (ziVar == ziVar2) {
            return ziVar2;
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void e(CharSequence charSequence) {
        this.c.a0.e1(charSequence, false);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        wm wmVar = this.c;
        if (wmVar.G5 != this.a) {
            return;
        }
        org.telegram.messenger.ye yeVar = this.b;
        if (yeVar.w || yeVar.v || yeVar.u || b20Var != null) {
            wmVar.u(yeVar, b20Var, z10, i10, 0, z11, 0L);
        } else {
            wmVar.a0.a0();
        }
    }
}
