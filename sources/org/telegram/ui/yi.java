package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.nj0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ sg.o0 n;
    public final /* synthetic */ org.telegram.messenger.kj r;
    public final /* synthetic */ un s;

    public yi(un unVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.nj0 nj0Var, float f7, float f10, sg.o0 o0Var, org.telegram.messenger.kj kjVar) {
        this.s = unVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = nj0Var;
        this.f = f7;
        this.h = f10;
        this.n = o0Var;
        this.r = kjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            un unVar = this.s;
            if (unVar.yc != null) {
                unVar.yc = null;
                if (this.b) {
                    unVar.t8(new xi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    unVar.t8(new ch(9, this, this.r));
                }
                unVar.M7(true);
            }
        }
    }
}
