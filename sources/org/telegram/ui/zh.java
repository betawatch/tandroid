package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zh implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.li0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ dh.n0 n;
    public final /* synthetic */ org.telegram.messenger.zi r;
    public final /* synthetic */ wm s;

    public zh(wm wmVar, boolean z10, boolean z11, int i3, boolean z12, org.telegram.ui.Components.li0 li0Var, float f10, float f11, dh.n0 n0Var, org.telegram.messenger.zi ziVar) {
        this.s = wmVar;
        this.a = z10;
        this.b = z11;
        this.c = i3;
        this.d = z12;
        this.e = li0Var;
        this.f = f10;
        this.h = f11;
        this.n = n0Var;
        this.r = ziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            wm wmVar = this.s;
            if (wmVar.Gc != null) {
                wmVar.Gc = null;
                if (this.b) {
                    wmVar.w8(new yh(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    wmVar.w8(new sc(20, this, this.r));
                }
                wmVar.O7(true);
            }
        }
    }
}
