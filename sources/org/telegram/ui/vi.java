package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.kl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.n0 n;

    public /* synthetic */ vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.kl0 kl0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.a = i11;
        this.b = wiVar;
        this.c = i10;
        this.d = z10;
        this.e = kl0Var;
        this.f = f7;
        this.h = f10;
        this.n = n0Var;
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
                org.telegram.ui.Cells.a0 t82 = znVar.t8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.j0.d(znVar, this.e, t82, null, this.f, this.h, this.n, i10, 1);
                    zg.j0.f();
                    break;
                }
                break;
        }
    }
}
