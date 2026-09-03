package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.pk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ mg.q0 n;

    public /* synthetic */ ti(ui uiVar, int i10, boolean z4, org.telegram.ui.Components.pk0 pk0Var, float f10, float f11, mg.q0 q0Var, int i11) {
        this.a = i11;
        this.b = uiVar;
        this.c = i10;
        this.d = z4;
        this.e = pk0Var;
        this.f = f10;
        this.h = f11;
        this.n = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ti(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                zn znVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = znVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    mg.m0.d(znVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    mg.m0.f();
                    break;
                }
                break;
        }
    }
}
