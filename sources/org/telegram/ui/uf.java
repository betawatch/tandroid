package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ uf(wm wmVar, TLRPC.User user, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm wmVar = this.b;
                wmVar.getClass();
                wmVar.presentFragment(wm.ra(this.c.id));
                break;
            default:
                this.b.Ma(this.c);
                break;
        }
    }
}
