package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ bh.x0 n;

    public /* synthetic */ qi(ri riVar, int i10, boolean z10, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, bh.x0 x0Var, int i11) {
        this.a = i11;
        this.b = riVar;
        this.c = i10;
        this.d = z10;
        this.e = gl0Var;
        this.f = f7;
        this.h = f10;
        this.n = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                wn wnVar = this.b.s;
                org.telegram.ui.Cells.z A8 = wnVar.A8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    bh.s0.d(wnVar, this.e, A8, null, this.f, this.h, this.n, i10, 1);
                    bh.s0.f();
                    break;
                }
                break;
        }
    }
}
