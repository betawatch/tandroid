package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.nj0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ sg.o0 n;

    public /* synthetic */ xi(yi yiVar, int i10, boolean z10, org.telegram.ui.Components.nj0 nj0Var, float f7, float f10, sg.o0 o0Var, int i11) {
        this.a = i11;
        this.b = yiVar;
        this.c = i10;
        this.d = z10;
        this.e = nj0Var;
        this.f = f7;
        this.h = f10;
        this.n = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.h3(new xi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                un unVar = this.b.s;
                org.telegram.ui.Cells.z E8 = unVar.E8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    sg.k0.d(unVar, this.e, E8, null, this.f, this.h, this.n, i10, 1);
                    sg.k0.f();
                    break;
                }
                break;
        }
    }
}
