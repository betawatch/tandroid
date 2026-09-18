package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.qk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.o0 n;

    public /* synthetic */ ui(vi viVar, int i10, boolean z10, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.a = i11;
        this.b = viVar;
        this.c = i10;
        this.d = z10;
        this.e = qk0Var;
        this.f = f7;
        this.h = f10;
        this.n = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ui(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                zn znVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = znVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.k0.d(znVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    zg.k0.f();
                    break;
                }
                break;
        }
    }
}
