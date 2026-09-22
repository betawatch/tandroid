package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.sk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.p0 n;

    public /* synthetic */ vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.a = i11;
        this.b = wiVar;
        this.c = i10;
        this.d = z10;
        this.e = sk0Var;
        this.f = f7;
        this.h = f10;
        this.n = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                zn znVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = znVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.l0.d(znVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    zg.l0.f();
                    break;
                }
                break;
        }
    }
}
