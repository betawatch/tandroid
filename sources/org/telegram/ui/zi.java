package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zi extends mg.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ rn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi(rn rnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10, int i11) {
        super(i10, c6Var);
        this.n = i11;
        this.r = rnVar;
    }

    @Override // mg.b, mg.a
    public final int p2() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                rn rnVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                if (!ng.c.c(i10, rnVar.aa)) {
                    break;
                } else if (rnVar.aa != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                rn rnVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) rnVar2).currentAccount;
                if (!ng.c.c(i11, rnVar2.aa)) {
                    break;
                } else if (rnVar2.aa != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
