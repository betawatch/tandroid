package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zm extends we.d {
    public final /* synthetic */ org.telegram.ui.Cells.s1 d;
    public final /* synthetic */ dn e;

    public zm(dn dnVar, org.telegram.ui.Cells.s1 s1Var) {
        this.e = dnVar;
        this.d = s1Var;
    }

    @Override // we.d
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new qj(this.e.a, 8), 250L);
    }

    @Override // we.d
    public final void d() {
        dn dnVar = this.e;
        rn rnVar = dnVar.a;
        org.telegram.ui.Cells.s1 s1Var = this.d;
        rnVar.sb = s1Var.getMessageObject().getId();
        rn rnVar2 = dnVar.a;
        rnVar2.tb = 2;
        rnVar2.ub = null;
        s1Var.invalidate();
    }
}
