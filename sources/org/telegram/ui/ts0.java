package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ts0(zs0 zs0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = zs0Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.zc.F(this.b.b.e0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.zc.F(this.b.b.e0, this.c).j();
                break;
        }
    }
}
