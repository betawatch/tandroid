package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.rk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ng.q0 n;

    public /* synthetic */ ri(si siVar, int i10, boolean z4, org.telegram.ui.Components.rk0 rk0Var, float f10, float f11, ng.q0 q0Var, int i11) {
        this.a = i11;
        this.b = siVar;
        this.c = i10;
        this.d = z4;
        this.e = rk0Var;
        this.f = f10;
        this.h = f11;
        this.n = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ri(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                xn xnVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = xnVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ng.m0.d(xnVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    ng.m0.f();
                    break;
                }
                break;
        }
    }
}
