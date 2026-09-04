package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.fk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.j1 n;

    public /* synthetic */ vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, int i11) {
        this.a = i11;
        this.b = wiVar;
        this.c = i10;
        this.d = z10;
        this.e = fk0Var;
        this.f = f7;
        this.h = f10;
        this.n = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                co coVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = coVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ah.e1.d(coVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    ah.e1.f();
                    break;
                }
                break;
        }
    }
}
