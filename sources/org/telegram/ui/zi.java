package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aj b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.i1 n;

    public /* synthetic */ zi(aj ajVar, int i10, boolean z10, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.a = i11;
        this.b = ajVar;
        this.c = i10;
        this.d = z10;
        this.e = gl0Var;
        this.f = f7;
        this.h = f10;
        this.n = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                fo foVar = this.b.s;
                org.telegram.ui.Cells.a0 t82 = foVar.t8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    ah.d1.d(foVar, this.e, t82, null, this.f, this.h, this.n, i10, 1);
                    ah.d1.f();
                    break;
                }
                break;
        }
    }
}
