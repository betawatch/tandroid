package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.mj0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ sg.o0 n;
    public final /* synthetic */ org.telegram.messenger.jj r;
    public final /* synthetic */ un s;

    public yi(un unVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.mj0 mj0Var, float f7, float f10, sg.o0 o0Var, org.telegram.messenger.jj jjVar) {
        this.s = unVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = mj0Var;
        this.f = f7;
        this.h = f10;
        this.n = o0Var;
        this.r = jjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            un unVar = this.s;
            if (unVar.xc != null) {
                unVar.xc = null;
                if (this.b) {
                    unVar.p8(new xi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    unVar.p8(new zg(9, this, this.r));
                }
                unVar.I7(true);
            }
        }
    }
}
