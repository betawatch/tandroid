package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.sk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.m0 n;

    public /* synthetic */ ti(ui uiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.m0 m0Var, int i11) {
        this.a = i11;
        this.b = uiVar;
        this.c = i10;
        this.d = z10;
        this.e = sk0Var;
        this.f = f7;
        this.h = f10;
        this.n = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ti(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                yn ynVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = ynVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    zg.i0.d(ynVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    zg.i0.f();
                    break;
                }
                break;
        }
    }
}
