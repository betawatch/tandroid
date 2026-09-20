package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ui implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.pk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.o0 n;

    public /* synthetic */ ui(vi viVar, int i10, boolean z10, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.a = i11;
        this.b = viVar;
        this.c = i10;
        this.d = z10;
        this.e = pk0Var;
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
