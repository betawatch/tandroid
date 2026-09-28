package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class si implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.sk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.o0 n;

    public /* synthetic */ si(ti tiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.a = i11;
        this.b = tiVar;
        this.c = i10;
        this.d = z10;
        this.e = sk0Var;
        this.f = f7;
        this.h = f10;
        this.n = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new si(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                wn wnVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = wnVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    zg.k0.d(wnVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    zg.k0.f();
                    break;
                }
                break;
        }
    }
}
