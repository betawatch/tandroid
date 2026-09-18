package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.p0 n;

    public /* synthetic */ wi(xi xiVar, int i10, boolean z10, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.a = i11;
        this.b = xiVar;
        this.c = i10;
        this.d = z10;
        this.e = gk0Var;
        this.f = f7;
        this.h = f10;
        this.n = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                bo boVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = boVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    zg.l0.d(boVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    zg.l0.f();
                    break;
                }
                break;
        }
    }
}
