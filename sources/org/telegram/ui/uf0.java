package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ uf0(bg0 bg0Var, int i10, int i11) {
        this.a = i11;
        this.b = bg0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uf0(this.b, this.c, 1));
                break;
            case 1:
                this.b.A(this.c);
                break;
            default:
                this.b.f.f[this.c].l(1.0f);
                break;
        }
    }
}
