package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ vg(fo foVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                foVar.getClass();
                foVar.presentFragment(fo.W9(this.c.id));
                break;
            default:
                this.b.ra(this.c);
                break;
        }
    }
}
