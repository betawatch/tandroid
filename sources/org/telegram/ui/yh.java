package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.li0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ dh.n0 n;

    public /* synthetic */ yh(zh zhVar, int i3, boolean z10, org.telegram.ui.Components.li0 li0Var, float f10, float f11, dh.n0 n0Var, int i10) {
        this.a = i10;
        this.b = zhVar;
        this.c = i3;
        this.d = z10;
        this.e = li0Var;
        this.f = f10;
        this.h = f11;
        this.n = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.i3(new yh(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                wm wmVar = this.b.s;
                org.telegram.ui.Cells.z H8 = wmVar.H8(this.c, true);
                if (this.d) {
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    dh.j0.d(wmVar, this.e, H8, null, this.f, this.h, this.n, i3, 1);
                    dh.j0.f();
                    break;
                }
                break;
        }
    }
}
