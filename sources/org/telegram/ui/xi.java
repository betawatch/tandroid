package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.pk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ yg.p0 n;

    public /* synthetic */ xi(yi yiVar, int i10, boolean z10, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, yg.p0 p0Var, int i11) {
        this.a = i11;
        this.b = yiVar;
        this.c = i10;
        this.d = z10;
        this.e = pk0Var;
        this.f = f7;
        this.h = f10;
        this.n = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                eo eoVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = eoVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    yg.l0.d(eoVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    yg.l0.f();
                    break;
                }
                break;
        }
    }
}
